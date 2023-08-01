package day1;

import java.util.Scanner;

public class C04_sAYİNİNkUBU {

    public static void main(String[] args) {

        // Soru 4-)   SCANNER
        //            Kullanıcıdan bir sayı alın ve aldiginiz bu sayının küpünün yarısını konsola yazdırin.


        Scanner scanner = new Scanner(System.in);
        double sayi;
        double sonuc;

        System.out.println("Lutfen bir sayi girin");
        sayi = scanner.nextDouble();

        sonuc = (sayi*sayi*sayi)/2;

        System.out.println("sonuc : "+sonuc);
    }

}
