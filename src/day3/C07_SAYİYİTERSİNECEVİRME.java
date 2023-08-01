package day3;

import java.util.Scanner;

public class C07_SAYİYİTERSİNECEVİRME {

    public static void main(String[] args) {

        /*
        Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
Örnek:
      Sayı: 1238
      Sayının Tersi: 8321
İpucu:  Loop kullanabilirsiniz.
         */

        Scanner scanner = new Scanner(System.in);
        String sayi;
        System.out.println("Lutfen bir sayi giriniz");
        sayi = scanner.next();

        for (int i = sayi.length()-1; i >=0 ; i--) {
            System.out.print(sayi.charAt(i));

        }
    }
}
