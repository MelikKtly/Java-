import java.util.Scanner;

public class d15 {
    public static void main(String[] args) {
        
        int sıcaklık, toplam=0;
        double ortalama=0;
        String ay;
        int gunsayisi;
        
        Scanner giris=new Scanner(System.in);

        System.out.println("ay:");
        ay=giris.nextLine();

        if(ay.equals("subat")){
            gunsayisi=6;
        }

        else{
            gunsayisi=5;
        }

        for (int i = 0; i < gunsayisi; i++) {
            System.out.println("Sıcaklık:");
            sıcaklık=giris.nextInt();
            toplam=toplam+sıcaklık;

        }

        System.out.println(toplam);
        ortalama=toplam/gunsayisi;
        System.out.println(ortalama);


        












    }
}
