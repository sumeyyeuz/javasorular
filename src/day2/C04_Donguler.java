package day2;

import java.util.Scanner;

public class C04_Donguler {

    public static void main(String[] args) {

        // Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından isimde karakterin kaç kez tekrarlandığını kontrol edelim.
        // Örnek:
        // char ch1=            'a'
        // String name =     "Ali bakkala geç gitti."
        // Beklenen Çıktı=    a sayısı = 3
        // Ipucu:
        // Loop döngülerini hatırlayalım. While döngüsü kullanabilirsiniz!
        // Sayac adlı bir int variable oluşturarak bunun ile kelimenin kaç defa geçtigini Loop içindeki İf ile bulabilirsiniz!

        Scanner scanner = new Scanner(System.in);

        String metin;
        char karakter;

        System.out.println("Lutfen bir metin ve aramak istediginiz karakteri giriniz");
        metin = scanner.nextLine();
        karakter = scanner.next().charAt(0);

        int sayac = 0;

        for (int i = 0; i < metin.length(); i++) {
            if (metin.charAt(i) == karakter) {
                sayac++;
            }

        }
        if (sayac == 0) {
            System.out.println("Girilen karakter metinde hiç kullanilmamistir");
        } else {
            System.out.println("Girilen karakter metin icerisinde " + sayac + " defa kullanilmistir");
        }

    }


}
