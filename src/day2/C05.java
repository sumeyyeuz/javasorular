package day2;

import java.util.Scanner;

public class C05 {

    public static void main(String[] args) {

        // Soru 15-)  Kullanıcıdan en az 5 harfli bir kelime alın. Alınan kelimenin son 3 harfinin 2 kopyasından oluşan yeni bir String oluşturun ve konsolda yazdırın
        //            Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
        //            Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
        //            Loopun içerisinde StringM methodlarından  yararlanalım!

        Scanner scanner = new Scanner(System.in);
        String kelime;

        System.out.println("Lutfen 5 harflibir kelime giriniz");
        kelime = scanner.next();

        String kelimeKopya ="";

        boolean flag = true;

        while (flag){
            if(kelime.length()<5){
                System.out.println("Kelime 5 harf icermeli");
                kelime = scanner.next();

            }else{
                for (int i = kelime.length()-3; i <kelime.length() ; i++) {  // hatice
                    kelimeKopya += kelime.charAt(i);
                    flag = false;
                }

            }
        }
        System.out.println(kelimeKopya.repeat(2));




    }
}
