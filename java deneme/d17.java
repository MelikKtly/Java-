public class d17 {
    public static void main(String[] args) {
        
        int[] sayılar= new int[20];
        int EBY=0;

        System.out.println("Rastgele sayılar bunlardır:");

        for (int i = 0; i < sayılar.length; i++) {
            sayılar[i]=(int)(Math.random()*100);

            System.out.println((i+1)+".sayı="+sayılar[i]);

            if(i==0)
            EBY=sayılar[0];

            if(sayılar[i]>EBY)
            EBY=sayılar[i];
            
        }

        System.out.println("En büyük sayı="+EBY);













    }
}
