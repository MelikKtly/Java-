import java.util.Scanner;

public class d5 {
    
    public static void main(String[] args) {
        
        double KS1,KS2,KS3,KSort,vize1,vize2,vizeort,Final,BP;

        Scanner giris=new Scanner(System.in);

        System.out.println("lütfen kısa sınav notlarınızı giriniz.");
        KS1=giris.nextDouble();
        KS2=giris.nextDouble();
        KS3=giris.nextDouble();

        KSort=(KS1+KS2+KS3)/3;

        System.out.println("lütfen vize notlarınızı giriniz");
        vize1=giris.nextDouble();
        vize2=giris.nextDouble();

        vizeort=(vize1+vize2)/2;


        System.out.println("lütfen final notunuzu giriniz");
        Final=giris.nextDouble();

        BP=(KSort*0.5+vizeort*0.5)*0.4+Final*0.6;

        System.out.println("Başarı puanınız="+BP);





    }
}
