import java.util.Scanner;

public class satırsutun3 {
    public static void main(String[] args) {

        int satır,sütun,toplam=0,ortalama=0;

        Scanner giris= new Scanner(System.in);

        System.out.println("lütfen satırı giriniz");
        satır=giris.nextInt();

        System.out.println("lütfen sütunu giriniz");
        sütun=giris.nextInt();

        int[][] dizi = new  int[satır][sütun];

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {

                dizi[i][j]=50+((int)(Math.random()*50));
                System.out.print(dizi[i][j]+"\t");
                   
            }
            System.out.println();
        }

        for (int i = 0; i < dizi.length; i++) {
            toplam=0;
            
            for (int j = 0; j < dizi[i].length; j++) {

                toplam+=dizi[i][j];
                ortalama=toplam/sütun;

                
            }
            System.out.println((i+1)+".satırın toplamı="+toplam);
            System.out.println((i+1)+".satırın ortalaması="+ortalama);

        }
        













    }
}
