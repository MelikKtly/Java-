import java.util.Scanner;

public class d16 {
    public static void main(String[] args) {
        
        int[] sıcaklık=new int[7];
        int ortalama,toplam=0;
        Scanner giris=new Scanner(System.in);

        System.out.println("Lütfen sıcaklık bilgilerini giriniz");

        for (int i = 0; i < 7; i++) {

            System.out.print((i+1)+".Sıcaklık=");
            sıcaklık[i]=giris.nextInt();
            
        }

        for (int i = 0; i < 7; i++) {

            toplam=toplam+sıcaklık[i];
            
        }

        ortalama=toplam/7;
        System.out.println("sıcaklık ortalaması ="+ortalama);


    }
}
