import java.util.Scanner;

public class deneme2 {
    public static void main(String[] args) {

        String[] isim =new String[30];
        int[] puan =new int[20];
        int ogrencisayisi=4 ;

        Scanner giris=new Scanner(System.in);

        System.out.println("Lütfen öğrencilerin isimlerini giriniz");

        for (int i = 0; i <ogrencisayisi; i++) {

            isim[i]=giris.nextLine();
            
        }

        System.out.println("Lütfen öğrencilerin puanlarını giriniz");

        for (int i = 0; i <ogrencisayisi; i++) {

            puan[i]=giris.nextInt();
            
        }

       // System.out.println(isim[0]+"in puanı="+puan[0]);
       // System.out.println(isim[1]+"in puanı="+puan[1]);
       // System.out.println(isim[2]+"in puanı="+puan[2]);
      //  System.out.println(isim[3]+"in puanı="+puan[3]);


        for (int i = 0; i <ogrencisayisi; i++) {

            System.out.println(isim[i]+"in puanı="+puan[i]);
            
        }


        if(puan[0]>85){

            System.out.println("Notunuz AA");

        }
        



        













    }
}
