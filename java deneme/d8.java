import java.util.Scanner;

public class d8 {
    public static void main(String[] args) {
        
        int a,b,toplam=0;
        char işlem;
        Scanner giris=new Scanner(System.in);
         
        do{
        System.out.println("Lütfen ilk sayıyı giriniz");
        a=giris.nextInt();

        System.out.println("Lütfen ikinci sayıyı giriniz");
        b=giris.nextInt();
        toplam=a+b;

        System.out.println(toplam);

        System.out.println("İşleme devam etmek istiyor musunuz");
        işlem=giris.next().charAt(0);


        } while(işlem=='e');






















    }
}
