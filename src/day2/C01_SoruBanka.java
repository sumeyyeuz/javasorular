package day2;

import java.util.Scanner;

public class C01_SoruBanka {

    public static void main(String[] args) {

        // Soru 11-) Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
        //                 Ad ve soyadın baş harfleri büyük olmalıdır
        //                 Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
        //                 Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
        //Ipucu: IF ile çözebilirsiniz.
        //Giriş :
        //		 > Gandalf Grey 563245879632
        //Çıktı :
        //		 > İsim : G****** G***
        //		 > CCN : **** **** 9632


        Scanner scanner = new Scanner(System.in);
        String isim;
        String soyIsim;
        String kartNo;

        System.out.println("Lutfen sirasiyla isminizi soyisminizi ve kart numaranızı giriniz");
        isim = scanner.next();
        soyIsim = scanner.next();
        kartNo = scanner.next();

        char isimIlkHarf = isim.toUpperCase().charAt(0);
        char soyisimIlkHarf = soyIsim.toUpperCase().charAt(0);

        if (kartNo.length() == 12) {
            isim = isimIlkHarf + isim.substring(1).replaceAll("\\w", "*");
            soyIsim = soyisimIlkHarf + soyIsim.substring(1).replaceAll("\\w", "*");
            kartNo = kartNo.substring(0, 4).replaceAll("\\w", "*") + " " + kartNo.substring(4, 8).replaceAll("\\w", "*") +
                    " " + kartNo.substring(8);
            System.out.println(isim +" " + soyIsim + "\n" + kartNo);

        } else {
            System.out.println("Gecersiz kredi karti numarasi");
        }


    }
}
