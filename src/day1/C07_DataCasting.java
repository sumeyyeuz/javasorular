package day1;

import java.util.Scanner;

public class C07_DataCasting {

    public static void main(String[] args) {

        /*
        Soru 7-)  Kullanicidan Double türünde bir sayi alin. Alinan bu sayiyi tam sayiya cevirerek konsolda yazdirin.
                  (Istege bagli) Float degerinde bir sayi alin bu sayiyi da short degisken türünde bir sayiya döndürün
                  ipuclari:
                  ( Data Casting -> Auto Widening ve Explicit Narrowing )
         */

        Scanner scanner = new Scanner(System.in);

        double sayi;

        System.out.println("Lutfen ondalikli bir sayi giriniz");
        sayi = scanner.nextDouble();

        System.out.println((int)sayi);
    }
}
