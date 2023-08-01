package day1;

import java.util.Scanner;

public class C10_KiloEndeksi {

    public static void main(String[] args) {

        /*
    Kullanıcıdan kilosunu ve boyunu isteyin ve kütleyi hesaplayan bir program yazın
    **indeks Hesaplama: İPUCU : Vücut Kitle İndeksi = Ağırlık (kg) / Boy uzunluğunun karesi (m) // If konusunu hatırlayın!***
    Kullanıcıya aşağıdaki gibi mesaj verin:

        Eğer VKİ 18.5'ten az ise --> zayıfsınız
        Eğer VKİ vkarasında ise --> kilo idealdir
        Eğer VKİ 25 ila 30 arasındaysa --> şişmansınız
        VKİ 30'a eşit veya daha fazlaysa --> agam obezsin, diyet yap!

        ÖRNEK :

		Ağırlık : 71
		Yükseklik : 1,72

		ÇIKTI :

        VKİ değeriniz : 23.99945916711736 -> Kilonuz ideal
     */


        Scanner scan = new Scanner(System.in);

        double kg;
        double uzunluk;
        double vki;


        System.out.println("Lutfen agırlık degerinizi giriniz (kg)");
        kg = scan.nextDouble();

        System.out.println("Lutfen boyunuzu giriniz (m)");
        uzunluk = scan.nextDouble();

        vki = kg / (uzunluk * uzunluk);

        if (vki < 18.5) {
            System.out.println("Zayifsiniz");
        } else if (vki > 18.5 && vki < 25) {
            System.out.println("Kilo ideal");
        } else if (vki > 25 && vki < 30) {
            System.out.println("Kilolu");
        } else {
            System.out.println("Obezsin, diyet yap");
        }


    }

}
