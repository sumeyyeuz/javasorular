package day3;

public class C04_ALFABE {

    public static void main(String[] args) {

      //  Alfabeyi konsola yazdırın.
        // örnek:
     //   a b c .. .. .. .. y z

        /*
         char ifadeler matematiksel isleme girdikleri zaman Ascii degerleri konsolda yazdirilir
         char degerini yazdirabilmek icin (char) olarak casting yapmamiz gerekir
         */

        for (int i = 'a'; i <= 'z' ; i++) {
            System.out.print((char)i+" ");

        }
    }
}
