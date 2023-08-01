package day3;

import java.util.Arrays;

public class C12_ArrayiTersCevirme {

    public static void main(String[] args) {

        /*
        Soru 33-)
        Array kullanarak String bir cümleyi Reverse eden (tersine çeviren) bir Java programı yazın (boşluklar ve özel karakterler dahil).
        Örnek:
        String str=''Kodlama harika.''
        String arr[]: ".etaerg si gnidoC"
        İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak son karakterden başlayıp tersten yazdırın
         */

        String str = "Kodlama harika";
        String str1 = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            str1 += str.charAt(i);

        }
        System.out.println(str1);

        String[] arr = new String[1];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = str1;

        }
        System.out.println(Arrays.toString(arr));



    }
}
