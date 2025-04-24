import java.util.Scanner;

public class dizirastgele {
    
    public static void main(String[] args) {
        

        int[] sayılar=new int[5];
        Scanner giris=new Scanner(System.in);
        int adet1=0,çift=0,ortalama=0;

        for (int i = 0; i < 5; i++) {

            sayılar[i]=(int)(Math.random()*20);
            
        }
        for (int i = 0; i < 5; i++) {

            System.out.println((i+1)+".sayı="+sayılar[i]);
            
        }

        for (int i = 0; i < sayılar.length; i++) {

            if(sayılar[i]>10){
                adet1++;
                System.out.println("10 dan büyük sayılar="+sayılar[i]);

            }
            if(sayılar[i]<10){

                ortalama=sayılar[i]/5;
            }
            if(sayılar[i]%2==0){

                System.out.println("Çift sayılar="+sayılar[i]);

                çift=çift+1;
            }
            
        }

        System.out.println();

        
        System.out.println("10 dan büyük sayı adedi="+adet1);
        System.out.println("ortalama="+ortalama);
        System.out.println("çift adedi="+çift);



























    }
}
