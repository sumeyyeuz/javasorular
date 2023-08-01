package day1;

import java.util.Scanner;

public class C01_DaireninAlani {

    public static void main(String[] args) {

        /*
        Soru 1-)   SOUT/SYSO
                   Dairenin alanini ve cevresini hesaplayan java kodu yaziniz.
                   Ipuclari:
                   * r=7;
                   * Pi=3.14
                   * Dairenin Cevresi : 2*Pi*r
                   * Dairenin Alani : Pi*r*r
       */

        Scanner scanner = new Scanner(System.in);
        int r ;
        double pi = 3.14;
        double cevre;
        double alan;

        System.out.println("Lutfen yari capi giriniz");
        r = scanner.nextInt();

        cevre =( 2 * pi * r) ;
        alan = (pi * r * r);             // Math.pow(r,2)

        System.out.println("Dairenin cevresi :"+ cevre);
        System.out.println("Dairenin alani :"+alan);



    }
}
