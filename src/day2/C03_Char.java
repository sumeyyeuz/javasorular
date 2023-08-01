package day2;

import java.util.Scanner;

public class C03_Char {

    public static void main(String[] args) {

        // Soru 13-)
        //           Char cevap değişkeninin değerini test edelim ve aşağıdaki eylemleri gerçekleştiren bir kod yazalım:
        //           Cevap a ise, konsolda 'İsteğiniz işleniyor' mesajı yazsın
        //           Yanıt b ise, konsolda 'Değerlendirmeniz için yine de teşekkür ederiz' mesajı yazsın
        //           Yanıt c ise 'Üzgünüm şuanda yardımcı olamıyoruz' mesajı,
        //           Yanıtın başka bir değeri için ise 'Geçersiz giriş, lütfen tekrar deneyin!' mesajı yazdırılsın.
        //           Ipucu:
        //           Switch konusunu hatırlayalım!


          Scanner scanner = new Scanner(System.in);

          char cevap;
          System.out.println("Lutfen bir karakter giriniz 'a','b','c'");
          cevap = scanner.next().charAt(0);

          switch (cevap){
              case 'a' :
                  System.out.println("İsteğiniz işleniyor' mesajı ");
              case 'b' :
                  System.out.println("İsteğiniz işleniyor");
              case 'c' :
                  System.out.println("Üzgünüm şuanda yardımcı olamıyoruz");
          }


    }
}
