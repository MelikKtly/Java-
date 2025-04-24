import java.util.Scanner;

import org.xml.sax.SAXException;

public class satırsutun2 {
    public static void main(String[] args) {
        int sayilar[][] = { {99, 37, 15, 51, 20, 78, 99, 33, 92, 41},
        {98, 93, 41, 19, 27, 93, 63, 36, 63, 28},
        {23, 20, 50, 56, 28, 79, 81, 39, 33, 49},
        {33, 36, 58, 92, 47, 32, 74, 32, 23, 26},
        {92, 88, 78, 68, 65, 81, 26, 89, 23, 54},
        {84, 32, 34, 81, 81, 53, 71, 39, 62, 39}};

        Scanner giris = new Scanner(System.in);

        int sınır;

        System.out.println("Lütfen sınırı belirleyiniz");
        sınır=giris.nextInt();

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                if(sayilar[i][j]>sınır){
                    sayilar[i][j]=0;

                }
                
            }
            
        }

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                System.out.print(sayilar[i][j]+"\t");
            }
            System.out.println();
        }
    











    }
}
