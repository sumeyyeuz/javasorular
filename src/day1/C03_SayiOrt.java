package day1;

import java.util.Scanner;

public class C03_SayiOrt {

    public static void main(String[] args) {

        /*
         SCANNER
             Kullanicidan 5 tane sayi alin,alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.
         */

        Scanner scanner = new Scanner(System.in);
        int sayi1;
        int sayi2;
        int sayi3;
        int sayi4;
        int sayi5;
        int toplam;
        double ortalama;

        System.out.println("Lutfen 5 adet tam sayi giriniz");


        sayi1 = scanner.nextInt();
        sayi2 = scanner.nextInt();
        sayi3 = scanner.nextInt();
        sayi4 = scanner.nextInt();
        sayi5 = scanner.nextInt();

        toplam = (sayi1+sayi2+sayi3+sayi4+sayi5);
        ortalama = (double) (toplam)/5;   // ortalama double cıkabilir bunun icin int sayilari cast ettik

        System.out.println("Verieln sayilarin ortalamasi : "+ortalama);


    }
}
