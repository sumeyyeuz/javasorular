package day3;

import java.util.Arrays;
import java.util.Scanner;

public class C11_ARRAYYAZMA {

    public static void main(String[] args) {

        /*
        Soru 31-)
                 Kullanıcıdan Arrayin uzunlugunu isteyin.
                 Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
                 İpucu:  Önce uzunluk alıp arrayi oluştur daha sonra loop ile kullancııya doldurt
         */

        Scanner scanner = new Scanner(System.in);
        int lenght;
        System.out.println("Lutfen dizinin uzunlugunu giriniz");
        lenght = scanner.nextInt();

        int[] arr = new int[lenght];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+1+". elemanini giriniz");
            arr[i] = scanner.nextInt();

        }
        System.out.println(Arrays.toString(arr));


    }
}
