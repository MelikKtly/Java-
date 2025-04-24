import java.util.Scanner;

public class d6 {
    public static void main(String[] args) {
        

        double ekücret=0,saat;

        Scanner giris=new Scanner(System.in);

        System.out.println("Kaç saat çalıştınız?");
        saat=giris.nextDouble();

        if(saat<10){

            ekücret=saat*50;
        }

        else if(saat>=10 && saat<=20){

            ekücret=saat*51.5;
        }

       else if(saat>20){

            ekücret=saat*53.5;
        }

        System.out.println("Alacağınız ek ücret = "+ekücret);
        


















    }
}
