import java.util.Scanner;

public class d14 {
    public static void main(String[] args) {
        
        int a,b,toplam=0,adet=0;
        char seçim;
        Scanner giris=new Scanner(System.in);

        do {

            
            
         System.out.println("ilk sayiyi giriniz");
        a=giris.nextInt();

        System.out.println("ikinci sayiyi giriniz");
        b=giris.nextInt();
        toplam=a+b;

        System.out.println(toplam);

        System.out.println("devam etmek ister misiniz ? e/E");
        seçim=giris.next().charAt(0);
       
        adet=adet+1;
        

            
        } while (seçim=='e' ||  seçim=='E');

        System.out.println("adet="+adet);

        











    }
}
