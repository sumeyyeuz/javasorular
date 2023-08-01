package day3;

import java.util.Scanner;

public class C05_MUKSAYİ {

    public static void main(String[] args) {

        /*
             Sayının Mükemmel sayı olup olmadığını kontrol eden kodu yazalım.
             NOT:  Kendisi hariç, pozitif bölenlerinin toplamı o sayıya eşitse, bu tür sayılar Mükemmel Sayı olabilir.
             Örnek:
             Giriş :6
             Çıkış: 6 Mükemmel Sayıdır
             Giriş :7
             Çıkış:7 Mükemmel Sayı Değildir
             ipucu: For Loop kullanarak ve belki biraz da if else yardımı ile bu soruyu çözebilirsiniz
         */

        Scanner scanner = new Scanner(System.in);
        int sayi;
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        sayi = scanner.nextInt();
        int toplam = 0;

        for (int i = 1; i < sayi ; i++) {
            if(sayi%i==0){
                toplam += i;
            }

        }
        if(sayi==toplam){
            System.out.println(sayi+": Mükemmel Sayi");
        }else{
            System.out.println(sayi+": Mükemmel Sayi Degil");
        }
    }
}
