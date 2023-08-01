package day2;

import java.util.Scanner;

public class C08_Method {

    public static void main(String[] args) {

        // Soru 18-) Method Sorusu
        //Girilen araç hızı ve yol kilometresinden, gidilen yere varış süresini hesaplayan bir method yazalım.
        // Kullanıcıya hızını ve kilometreyi soralım, bunu methoda gönderelim ve bize varış süremizi hesaplasın
        //İpucu:
        //yol=Hız*zaman

        Scanner scanner = new Scanner(System.in);
        double hız;
        double yol;
        System.out.println("Lutfen hizinizi giriniz");
        hız = scanner.nextDouble();

        System.out.println("Lutfen yolu giriniz");
        yol = scanner.nextDouble();

        System.out.println("Varis suresi : " + varısSuresiHesapla(hız, yol));


    }

    public static double varısSuresiHesapla(double hız, double yol) {

        double zaman = yol / hız;

        return zaman;
    }
}
