//package Assignment11;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Fatura {
    ArrayList<Urun> urunler=new ArrayList<Urun>();

/*Faturayi Yazdirdigimiz Kisim*/

    public void writer(String[] words,int satirlen) throws ParseException {
        SimpleDateFormat sdformat = new SimpleDateFormat("dd.MM.yyyy");
        Date uyeliktarih = sdformat.parse(words[2]);
        int siparis = 3;
        int adet = 4;
        double Total = 0;


        System.out.println("---"+words[0]+"---");

        /*Urunleri Tek Tek Kontrol Ediyor Alttaki Kisim Uygun Olanlari Yazdiriyor*/

        for(int i = 0;i<satirlen;i++){
            Date urunbaslangic = sdformat.parse(urunler.get(i).getStartdate());
            Date urunson = sdformat.parse(urunler.get(i).getEnddate());
            if(words[1].equals(urunler.get(i).getKind())&&words[siparis].equals(urunler.get(i).getPname())&&uyeliktarih.compareTo(urunbaslangic)>=0 && uyeliktarih.compareTo(urunson)<= 0){

                System.out.println(urunler.get(i).getPname()+"\t"+BigDecimal.valueOf(urunler.get(i).getPrice()).setScale(1,RoundingMode.DOWN)+"\t"+words[adet]+"\t"+BigDecimal.valueOf(urunler.get(i).getPrice()*Double.parseDouble(words[adet])).setScale(1,RoundingMode.DOWN));

                Total = Total+urunler.get(i).getPrice()*Double.parseDouble(words[adet]);
                
                if(words.length>3){
                    siparis= siparis + 2;
                    adet = adet + 2;
                    if(adet>=words.length){

                        BigDecimal bill = BigDecimal.valueOf(Total);

                        bill = bill.setScale(1, RoundingMode.DOWN);

                        System.out.println("Total:\t"+bill);

                        break;
                    }
                    else{

                    }
                    i =-1;
                }
                else{
                }
            }
            else{

            }
        }

    }

/*Arrayi Olusturdugumuz Kisim*/

    public ArrayList arrayoluşturma(String[] words){

        urunler.add ( new Urun(words[0], words[4], words[1], words[2], words[3]));
        return urunler;
        }
    public ArrayList<Urun> getÜrünler() {
        return urunler;
    }

    }
