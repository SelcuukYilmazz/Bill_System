//package Assignment11;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.regex.Pattern;

    public class Fileio {

        /*Dosya Okuma Bolumu*/

        int satirlen;
        Fatura fatura = new Fatura();
        Urun urun = new Urun();

        public static String[] words;
        public  String[] readFile(String path) {
            try {
                int i = 0;
                int length = Files.readAllLines(Paths.get(path)).size();
                String[] results = new String[length];
                for (String line : Files.readAllLines(Paths.get(path))) {
                    results[i++] = line;
                }
                return results;
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        /*Array Olusturma Bolumu*/

        public String[] filereader(String file) {
            String[] lines = readFile(file);
            satirlen = filelength(file);
            for (String line : lines) {
                words = line.split("\t");
                Pattern pattern = Pattern.compile("\t");
                words = pattern.split(line);
                fatura.arrayoluşturma(words);
                }

            return words;
            }

        /*Gerektigi Vakit Dosya Satir Sayisina Ulasma Methodu*/

        public int filelength(String file) {
            String[] lines = readFile(file);
            int satirlen = lines.length;
            return satirlen;
        }

        /*Fatura Yazdirma Methodu*/

        public String[] filewriter(String file) throws ParseException {
            String[] lines = readFile(file);
            for (String line : lines) {
                words = line.split("\t");
                Pattern pattern = Pattern.compile("\t");
                words = pattern.split(line);
                fatura.writer(words,satirlen);
            }

            return words;
        }
    }
