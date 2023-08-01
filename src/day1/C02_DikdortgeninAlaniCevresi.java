package day1;

import java.util.Scanner;

public class C02_DikdortgeninAlaniCevresi {

    public static void main(String[] args) {

        /*
        Soru-2)   SOUT/SYSO
                  Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
                  Ipuclari:
                  * Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)
                  * Dikdortgenin Alani : uzun kenar * kisa kenar
         */
        Scanner scanner = new Scanner(System.in);
        int kenar1;
        int kenar2;
        int cevre;
        int alan;

        System.out.println("Lutfen dikdortgenin kenar uzunluklarini giriniz");
        System.out.print("Birinci kenari giriniz");
        kenar1 = scanner.nextInt();

        System.out.print("Ikınci kenari giriniz");
        kenar2= scanner.nextInt();

        cevre = 2*(kenar1+kenar2);
        alan = kenar1 * kenar2;

        System.out.println("Dikdortgenin cevresi : "+cevre);
        System.out.println("DİKDORTGENİN ALANİ : "+alan);




    }
}
