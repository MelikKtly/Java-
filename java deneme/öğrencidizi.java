import java.util.Scanner;

public class öğrencidizi {
    public static void main(String[] args) {
    
        String[] isim=new String[5];
        int[][] notlar=new int[5][2];
        double ortalama=0;
        int adet=0;
       

        Scanner giris=new Scanner(System.in);

        System.out.println("Öğrencilerin isimlerini giriniz");

        for (int i = 0; i < isim.length; i++) {
            isim[i]=giris.nextLine();
        }

        System.out.println("Öğrencilerin notlarını giriniz");

        for (int i = 0; i < notlar.length; i++) {
            
            System.out.print("vize= ");
            notlar[i][0]=giris.nextInt(); 
                
             System.out.print("Final= ");
            notlar[i][1]=giris.nextInt();

            
        }
        System.out.println("");

        

        System.out.println("öğrenci adı\tvize\tfinal");

        for (int i = 0; i < notlar.length; i++) {

            System.out.println(isim[i]+"      \t\t"+notlar[i][0]+"\t"+notlar[i][1]);

            }
            System.out.println("");

            for (int i = 0; i < notlar.length; i++) {
                ortalama=notlar[i][0]*0.4+notlar[i][1]*0.6;
                System.out.println("ortalama="+ortalama);
            }
            System.out.println("");

            for (int i = 0; i < notlar.length; i++) {
                if(notlar[i][0]<50){
                    System.out.println(isim[i]+" adlı öğrencinin final notu = "+notlar[i][1]);
                }
                 if(ortalama<=70){
                    System.out.println(isim[i]+" kaldı");
    
                }
                else if(ortalama>70)
                System.out.println(isim[i]+" geçti");
    
                 if(notlar[i][0]<70 && notlar[i][0]>60){
                    if(notlar[i][1]>70){
    
                        System.out.println(isim[i]+" adlı öğrencinin notları = "+notlar[i][0]+" "+notlar[i][1]);
    
                        adet++;
                    }
            }
            
            }

        

        System.out.println("adet="+adet);




        


















        
    }
}
