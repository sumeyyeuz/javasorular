package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09 {

    public static void main(String[] args) {

        /*
        Soru 30-)
        Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
        ( mülakat sorusu )
        Örnek:
        String str="Javacokkolay"
        Yinelenen karakterler : [a, o, k]
        İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.
         */

        String str = "Javacokkolay";

        String[] array = str.split("");   // str'i array'e cevirdik
        System.out.println(Arrays.toString(array));  // String str da yazılan ifadenin her elemanini array olarak yazdirdik

        // yinelenen karakterleri ekleyebilmek icin bir liste olusturalim
        List<String> yinelenenKarakter = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {

            for (int j = i+1; j < array.length; j++) {

                if(array[i].equals(array[j])){

                    if(!yinelenenKarakter.contains(array[i])){

                        yinelenenKarakter.add(array[i]);
                    }
                }

            }

        }

        System.out.println(yinelenenKarakter);
    }
}
