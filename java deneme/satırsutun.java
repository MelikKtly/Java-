import java.util.Scanner;

import javax.swing.text.html.FormSubmitEvent;

public class satırsutun {
    public static void main(String[] args) {

        int sayilar[][] = { {99, 37, 15, 51, 20, 78, 99, 33, 92, 41},
        {98, 93, 41, 19, 27, 93, 63, 36, 63, 28},
        {23, 20, 50, 56, 28, 79, 81, 39, 33, 49},
        {33, 36, 58, 92, 47, 32, 74, 32, 23, 26},
        {92, 88, 78, 68, 65, 81, 26, 89, 23, 54},
        {84, 32, 34, 81, 81, 53, 71, 39, 62, 39}};

        int satırtop=0;

        System.out.println("Dizi "+sayilar.length+" X "+sayilar[0].length+" büyüklüğündedir");

        for (int i = 0; i < sayilar.length; i++) {

            satırtop=0;

            for (int j = 0; j < sayilar[i].length; j++) {

                satırtop=satırtop+sayilar[i][j];
                     
            }
            System.out.println((i+1)+".satır toplamı="+satırtop);
            
        }
        System.out.println();

        int sütuntop=0;

        for (int i = 0; i < sayilar[0].length; i++) {
            sütuntop=0;
            for (int j = 0; j < sayilar.length; j++) {

                sütuntop+=sayilar[i][j];   
            }
            System.out.println((i+1)+".sütun toplamı ="+sütuntop);
        }

        System.out.println();
        



    

 
   
        







    }
}
