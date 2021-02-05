//package Assignment11;
public class Urun {

    /*Urunlerin Ozellikleri*/

    String pname;
    String price;
    String kind;
    String startdate;
    String enddate;

    public Urun(String pname, String price, String kind, String startdate,String enddate) {
        this.pname = pname;
        this.price = price;
        this.kind = kind;
        this.startdate = startdate;
        this.enddate = enddate;

    }
    public Urun(){

    }

    /*Getter Setterlar*/

    public String getPname() {
        return pname;
    }

    public double getPrice() {
        return Double.parseDouble(price);
    }

    public String getKind() {
        return kind;
    }

    public String getStartdate() {
        return startdate;
    }

    public String getEnddate() {
        return enddate;
    }

}
