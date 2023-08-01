package day3;

public class C13_ {

    public static void main(String[] args) {

        /*
        Soru 34-)
Bir String'i parametre olarak kabul eden ve verilen dizede Stringde bulunan rakamların toplamını yazdıran bir Method yazın.

Örnek
String str : ade1r4d3
Int toplam : 8

         */

        String str = "ade1r4d3";
        System.out.println("Metin icerinde verilen rakamlar toplami: ");
        toplamYazdir(str);

    }

    public static void toplamYazdir(String str){
        int toplam = 0;

        str = str.replaceAll("\\D","");
        // once verilen string ifade icersinde rakam olmayan karakterleri yok ettik

        for (int i = 0; i < str.length(); i++) {


            // toplam += Integer.parseInt(String.volueOf(str.charAt(i))); toplam ifadesi bu şekilde yazilabilirdi
            // oncelikle  str.charAt(i) ifadesi char oldugu icin String olarak almamiz gerek, String methodlarini kullanmamiz icin
            // String.volueOf --> ifadesi icerisindeki ifadeyi String bir degere cevirir
            // Integer.parseInt --> String bir ifadeyi sayisal veri olarak islememizi saglar



            toplam += Integer.parseInt(""+str.charAt(i));

        }
        System.out.println(toplam);

    }
}
