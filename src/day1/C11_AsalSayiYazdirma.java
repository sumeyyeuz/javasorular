package day1;

public class C11_AsalSayiYazdirma {

    public static void main(String[] args) {

        // 100den buyuk ilk 10 asal sayiyi yazdirin

        int sayac = 0;
        int sayi = 101;

        boolean flag = true;

        while (sayac<10){

            for (int i = 2; i < sayi ; i++) {

                if(sayi%i==0){
                    flag = false;

                }


            }
            if(flag){
                System.out.print(sayi+" ");
                sayac++;
            }
            sayi++;
            flag = true;

        }
    }
}
