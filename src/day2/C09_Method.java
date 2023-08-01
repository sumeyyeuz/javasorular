package day2;

import java.util.Scanner;

public class C09_Method {

    public static void main(String[] args) {

        // Soru 19-)  Method Sorusu
        //Kullanıcıdan doğum tarihini alınız. Burcunu hesaplayan bir method yazınız.
        //ipucu:
        //Switch Case kullanabilirsiniz. Veya Method yazarak Method aracılıgı ile de yapabilirsiniz.

        Scanner scanner = new Scanner(System.in);
        int ay;
        int gun;

        System.out.println("Lutfen doğdugunuz ayin numarasini giriniz");
        ay = scanner.nextInt();

        System.out.println("Lutfen dogum gununuzu giriniz");
        gun = scanner.nextInt();

        burcHesapla(gun,ay);

    }

    public static void burcHesapla(int gun, int ay) {

        if (ay == 1 && gun >= 21 || ay == 2 && gun <= 19) {
            System.out.println("Kova burcu");
        } else if (ay == 2 && gun >= 20 || ay == 3 && gun <= 20) {
            System.out.println("Balik burcu");
        } else if (ay == 3 && gun >= 21 || ay == 4 && gun <= 20) {
            System.out.println("Koc burcu");
        } else if (ay == 4 && gun >= 21 || ay == 5 && gun <= 20) {
            System.out.println("Boga burcu");
        } else if (ay == 5 && gun >= 21 || ay == 6 && gun <= 21) {
            System.out.println("Ikizler burcu");
        } else if (ay == 6 && gun >= 22 || ay == 7 && gun <= 22) {
            System.out.println("Yengec burcu");
        } else if (ay == 7 && gun >= 23 || ay == 8 && gun <= 23) {
            System.out.println("Aslan burcu");
        } else if (ay == 8 && gun >= 24 || ay == 9 && gun <= 23) {
            System.out.println("Basak burcu");
        } else if (ay == 9 && gun >= 24 || ay == 10 && gun <= 23) {
            System.out.println("Terazi burcu");
        } else if (ay == 10 && gun >= 24 || ay == 11 && gun <= 22) {
            System.out.println("Akrep burcu");
        } else if (ay == 11 && gun >= 23 || ay == 12 && gun <= 21) {
            System.out.println("Yay burcu");
        } else if (ay == 12 && gun >= 22 || ay == 1 && gun <= 20) {
            System.out.println("Oglak burcu");
        } else {
            System.out.println("Yanlis deger girisi");
        }
    }
}