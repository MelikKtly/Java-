import java.util.Scanner;

public class d13 {
    public static void main(String[] args) {
        
        sayilarilistele();
        

    }

    static void sayilarilistele(){
        int a,b;
        int kalan;
        Scanner giris=new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz");
        a=giris.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        b=giris.nextInt();

        for (int i = a; i < b; i++) {
            kalan=i%5;

            if(kalan==0)
            System.out.println(i);
            
        }



    }

}
