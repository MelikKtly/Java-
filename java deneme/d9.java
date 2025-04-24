import java.util.Scanner;

public class d9 {
    public static void main(String[] args) {
        
        int sayı,toplam=0;

        Scanner giris=new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz");
        sayı=giris.nextInt();

        for(int i=1;i<sayı;i++){

            if(sayı%i==0)
            toplam=toplam+i;

        }


        if(toplam==sayı)
        System.out.println(sayı+" Mükemmel bir sayıdır");

        else
        System.out.println(sayı+" Mükemmel sayı değildir");
    }
}
