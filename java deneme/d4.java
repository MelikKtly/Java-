import java.util.Scanner;

public class d4 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        int boy,yaş;
        char cinsiyet;
        double ideal=0;
        double K=0;
        double kilo;

        Scanner giris=new Scanner(System.in);

        System.out.println("boyunuzu giriniz=");
        boy=giris.nextInt();
        System.out.println("kilonuzu giriniz=");
        kilo=giris.nextDouble();
        System.out.println("yaşınızı giriniz=");
        yaş=giris.nextInt();
        System.out.println("cinsiyetinizi giriniz:");
        cinsiyet=giris.next().charAt(0);

        if(cinsiyet=='E'){

            K=0.9;
            ideal=(boy-100+yaş/10)*K;

        }

        if(cinsiyet=='K'){

            K=0.8;
            ideal=(boy-100+yaş/10)*K;
            
        }

        System.out.println("İdeal kilonuz="+ideal);

        if(kilo>ideal){
            System.out.println("vermeniz gereken kilo ="+(kilo-ideal));

        }

        else if(kilo<ideal){

            System.out.println("almanız gereken kilo"+(ideal-kilo));
        }

       else if (kilo==ideal){
        System.out.println("kilonuz ideal");
       }
















    }
}
