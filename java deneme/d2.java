import java.util.Scanner;

public class d2 {
    public static void main(String[] args) {
        
        int saat,ücret=100,BM,SP,DV,net;

        Scanner giris=new Scanner(System.in);

        System.out.println("kaç saat çalıştınız ?");
        
        saat=giris.nextInt();

        BM=saat*ücret;
        SP=BM*15/100;
        DV=BM*10/100;
        net=BM-(SP+DV);

        System.out.println("Brüt maaş="+BM);
        System.out.println("Sigorta primi="+SP);
        System.out.println("Devlet vergisi="+DV);
        System.out.println("Net maaş ="+net);











    }
}
