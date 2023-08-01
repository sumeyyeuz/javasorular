package day1;

import java.util.Scanner;

public class C06_hESAP {

    public static void main(String[] args) {

        // Soru 6-)  Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
        // Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
        // 1 şeker = 1.5 gr
        //1 kg = 1000 gram      olarak hesaplayınç
        // Ipuclari:
        //·        Önce gram cinsinden yıllık ne kadar seker kullandıgını bulun ve kiloya çevirin

        Scanner scanner = new Scanner(System.in);
        int caySayisi;
        int sekerSayisi;
        double gunlukTuketim;
        double yillikTuketim;

        System.out.println("lutfen gunde kac bardak cay ictigini yaziniz");
        caySayisi = scanner.nextInt();

        System.out.println("Kac seker kkullandiginizi giriniz");
        sekerSayisi = scanner.nextInt();

        gunlukTuketim = caySayisi * sekerSayisi * (1.5);
        yillikTuketim = (gunlukTuketim * 365) / 1000;

        System.out.println("Yilda " + yillikTuketim + " kg sekertuketiyor");


    }
}
