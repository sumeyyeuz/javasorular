package day1;

import java.util.Scanner;

public class C08_BasamaklarToplami {

    public static void main(String[] args) {

        // Soru-8)  Kullanicidan üc basamaklı bir sayı alin.
        //               Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.

        Scanner scanner = new Scanner(System.in);
        int sayi;
        int birlerBas = 0;
        int rakamlarToplami =0;

        System.out.println("Lutfen  sayi giriniz");
        sayi = scanner.nextInt();

        while (sayi != 0){
            birlerBas = sayi % 10;
            rakamlarToplami += birlerBas;
            sayi /= 10;

        }

        System.out.println("Rakamlar toplami : "+rakamlarToplami);
    }
}
