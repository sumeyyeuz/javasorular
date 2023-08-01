package day2;

import java.util.Scanner;

public class C07 {

    public static void main(String[] args) {

        // Kullanıcıdan bir isim isteyelim. Bu isim 3 harfli olmalıdır. Ardından ismin aynı karakterlere sahip olup olmadığını kontrol edelim.
        //İsim aynı karakterlere sahipse konsolda "Dize yinelenen karakterlere sahip"  değil ise konsolda "Dize benzersiz karakterlere sahip" yazdıralım.
        //Ipucu:
        //IF/Else - Ternary kullanabilirsiniz. Harfleri Char ile alıp karşılaştırabilirsiniz.

        Scanner scanner = new Scanner(System.in);
        String isim;

        System.out.println("Lutfen 3 harfli bir isim giriniz");
        isim = scanner.next();

        if (isim.length() == 3) {

            if (isim.charAt(0) == isim.charAt(1) || isim.charAt(0) == isim.charAt(2) || isim.charAt(1) == isim.charAt(2)) {
                System.out.println("Dize yinelenen karakterlere sahip");
            } else {
                System.out.println("Dize benzersiz karakterlere sahip");
            }
        } else {
            System.out.println("Girdiginiz isim 3 harfli olmali");
        }

        System.out.println("--------------------------");

        boolean flag = true;

        while (flag) {
            if (isim.length() == 3) {

                if (isim.charAt(0) == isim.charAt(1) || isim.charAt(0) == isim.charAt(2) || isim.charAt(1) == isim.charAt(2)) {
                    System.out.println("Dize yinelenen karakterlere sahip");
                    flag = false;
                } else {
                    System.out.println("Dize benzersiz karakterlere sahip");
                    break;
                }
            } else {
                System.out.println("Girdiginiz isim 3 harfli olmali");
                break;
            }

        }
    }
}
