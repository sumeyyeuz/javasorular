package day3;

import java.util.Arrays;
import java.util.Scanner;

public class C10_ {

    public static void main(String[] args) {

        /*
        Soru 32-)
        Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir Integer Array dizesini Reverse olarak (tersten) yazdırınız.
        İpucu:  int arrReverse[] diye bir array oluşturun ve kullancıya oluşturdugunuz arrayi buna tersten assign edin.

         */

        Scanner scanner = new Scanner(System.in);

        int lenght;
        System.out.println("Dizinin uzunlugunu giriniz");
        lenght = scanner.nextInt();
        Integer[] arr = new Integer[lenght];

        System.out.println("Dizinin elemanlarini giriniz");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();

        }
        /*
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i] +" ");
             }
        bunu yapamayiz sadece elemanlari tersten yazdirir dizi icersinde göstermez
         */

        Integer[] reverse = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++) {

            reverse[i] = arr[arr.length-1 -i];
            // arr dizisi sondan baslayip ilk indexteki degerine kadar gitmeli
            // (arr.lenght-1) dedigimizde son index'e ulasiyoruz
            // (arr.lenght-1) ifadesinden i degerini cikardigimizda sondan baslayip bizi dizinin basina dogru goturur
            // Ornegin dizinin uzunlugu 4 olsun eleamanlar[1,2,3,4,]
            // reverse-->0 iken arr.lenght-1-i 3-0 3. yani son index [4] verir

        }

        System.out.println(Arrays.toString(reverse));




    }

}
