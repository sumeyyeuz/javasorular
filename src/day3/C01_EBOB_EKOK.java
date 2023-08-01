package day3;

import java.util.Scanner;

public class C01_EBOB_EKOK {

    public static void main(String[] args) {

        // Soru 22-)
        //        Kullanıcıdan 2 tamsayı girmesini isteyin, ardından GCD (En Büyük Ortak Bölen) ve LCM'yi bulun (En Küçük Ortak Kat)
        //        Giriş :
        //        30 ve 40
        //
        //        Beklenen Çıktı:
        //        30 ve 40 için EBOB= 10
        //        30 ve 40 için EKOK= 120
        //        ipucu:
        //        Loopları kullanarak çözebiliriz. İki sayının EKOK'u sayıların çarpımının sayıların EBOB'una bölünerek bulunabilir.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen iki pozitif tam sayi giriniz");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        int ebob = 0;
        int ekok = 0;

       int eboblimit = sayi1 < sayi2 ? sayi1 : sayi2;

        for (int i = 1; i <= eboblimit ; i++) {

            if(sayi1 % i == 0 && sayi2 % i == 0){
                ebob = i;
            }

        }
        /*
        ekok degerini bulurken dongu limitini iki sayinin carpimi olarak belirlemeliyiz
        eger aralarinda asal ise iki sayinin carpimi ekok degeri olarak belirlenir
        fakat ornegin sayilar 12 ile 15 ise ekok degerleri sayilarin carpimi olamaz
        bu nedenle döngüyü ekok degerini buldugu anda durdurabilmemiz icin "flag" kullanmamiz gerekir
         */

        boolean flag = true;

        System.out.println("Sayilarin EBOB'u : "+ebob);

        for (int i = 1; i <= sayi1*sayi2 ; i++) {

            if(i % sayi1 == 0 && i % sayi2 == 0){
                ekok = i;
                flag = false;
                break;
                   // ekok degerini buldugu anda dongu dursun
            }

        }
        System.out.println("Sayilarin EKOK'u : "+ekok);
        // Sayilarin EKOK'u : 120


    }


}
