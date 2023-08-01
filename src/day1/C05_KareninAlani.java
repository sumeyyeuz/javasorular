package day1;

import java.util.Scanner;

public class C05_KareninAlani {

    public static void main(String[] args) {

        // Soru 5-)   SCANNER
        //Kullanıcıdan karenin kenar uzunluğunu alın. Aldiginiz uzunluklarla karenin alanını ve çevresini hesaplayan kodu yazın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kareini bir kenarini giriniz");
        int kenar;
        kenar = scanner.nextInt();

        int cevre;
        int alan;

        // dairenin cevresi
        cevre = 4*kenar;
        alan = kenar*kenar;

        System.out.println("kenar uzunlugu verilen karenin cevresi : "+ cevre);
        System.out.println("kenar uzunlugu verilen karenin alani : "+alan);
    }
}
