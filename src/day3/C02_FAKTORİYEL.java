package day3;

import java.util.Scanner;

public class C02_FAKTORİYEL {

    public static void main(String[] args) {

        /*
             Girdi olarak bir tamsayı kabul eden ve bu tam sayının faktöriyelini hesaplayan bir method yazın.
             Method bize çıktıyı döndürsün.
             Örnek:
             Girdi: 6
             Çıktı: 6!=65432*1=720
             ipucu: Aldıgınız sayıyı methoda gönderin. Methodun içinde For Loop ile faktöriyelini hesaplayın.

         */

        Scanner scanner = new Scanner(System.in);

        int sayi;
        int faktoriyel = 1;
        System.out.println("Lutfen poitif bir tam sayi giriniz");
        sayi = scanner.nextInt();
        System.out.print(sayi+"!= ");

        for (int i = sayi; i >=1  ; i--) {

            if(i==1){
                System.out.print(i+"=");
            }else{
                System.out.print(i+"*");
            }
            faktoriyel *= i;

        }
        System.out.println(faktoriyel);



    }
}
