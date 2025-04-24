import java.util.Scanner;

public class deneme1 {
    public static void main(String[] args) {
        
        int[] dizi= new int[10];
        Scanner giris= new Scanner(System.in);

        int diziboyut;

        System.out.println("Lütfen 5 tane değer giriniz");
        

        for (int i = 0; i < 5; i++) {

            dizi[i]=giris.nextInt();

        }

        System.out.println();

        for (int i = 0; i<5; i++) {

            System.out.println(dizi[i]);
            
            
        }

        System.out.println();
        System.out.println(dizi[0]);
        System.out.println(dizi[1]);
        System.out.println(dizi[2]);
        System.out.println(dizi[3]);
        System.out.println(dizi[4]);

       







    }
}
