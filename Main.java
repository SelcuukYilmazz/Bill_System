//package Assignment11;

import java.text.ParseException;

public class Main { public static void main(String[] args) throws ParseException {
    Fileio fileio= new Fileio();

    /*Array Olusturma Methodu : Array Olusturulacak Dosyanin Adresini Girin*/

    fileio.filereader(args[1]);

    /*Fatura Yazdirma Methodu : Fatura Olusturacaginiz Insanlarin Dosya Adresini Girin*/

    fileio.filewriter(args[0]);
    }
}
