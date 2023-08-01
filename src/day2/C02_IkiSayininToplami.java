package day2;

import java.util.Scanner;

public class C02_IkiSayininToplami {

    public static void main(String[] args) {

        // Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir- hesaplamak ve yazdırmak için bir program oluşturalım
        // Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım
        // Ipucu:  IF/Else kullanabilirsiniz.
        // Örnek:
        // İki tamsayı girin:
        // 25  veya  4567986321453
        // 46   veya 123456
        // Konsolda Çıktı :
        // Sayıların toplamı: 71  veya  Fazla Yüklenme

        Scanner scanner = new Scanner(System.in);
        String sayi1;
        String sayi2;

        System.out.println("Lutfen 2 pozitif giriniz");
        sayi1 = scanner.next(); // 120
        sayi2 =scanner.next(); // 130

        long sayi1uzunluk = sayi1.length();
        long sayi2uzunluk = sayi2.length();

        long toplam = Long.parseLong(sayi1)+Long.parseLong(sayi2); //250
        String toplam1 = toplam +"";

        if(sayi1uzunluk>10 || sayi2uzunluk>10 || toplam1.length()>10){
            System.out.println("Fazla Yüklenme");
        }else{
            System.out.println("Sayilarin toplami : "+ toplam);
        }







    }
}
