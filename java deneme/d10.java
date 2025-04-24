


import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class d10 {
    public static void main(String[] args) {
        
        int tutulansayı,tutulansayı2,cevap,sonuç,puan=0,doğru=0,yanlış=0;
        char seçim;
        
        Scanner giris=new Scanner(System.in);

        do {
            
    
        tutulansayı=(int)(Math.random()*100);
        

        tutulansayı2=(int)(Math.random()*100);
        

        System.out.println(tutulansayı+"+"+tutulansayı2+"=?");
        sonuç=tutulansayı+tutulansayı2;
        

        cevap=giris.nextInt();
        System.out.println("Cevap="+cevap);

        if(cevap==sonuç)
        {
                System.out.println("Tebrikler bildiniz");
                puan=puan+5;
                doğru=doğru+1;

        }

        else{
        System.out.println("Üzgünüm bilemediniz");
        puan=puan-2;
       yanlış=yanlış+1;
        }


        System.out.println("Devam etmek ister misiniz?");
        seçim=giris.next().charAt(0);
        
        


    } while (seçim=='e' || seçim=='E');

    System.out.println(doğru+" tane doğrunuz "+yanlış+" tane yanlışınız var");

        System.out.println("Puanınız="+puan);




















    }
}
