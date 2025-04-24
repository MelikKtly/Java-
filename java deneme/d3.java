import java.util.Scanner;

public class d3 {

    public static void main(String[] args) {
    
        int ekmeksay,poğaçasay,simitsay;
        double ekmek=5, poğaça=7.5, simit=5,kazanç,vergi;

        Scanner giris=new Scanner(System.in);

        System.out.println("Ekmek sayisini giriniz=");
        ekmeksay=giris.nextInt();

        System.out.println("Poğaça sayısını giriniz=");
        poğaçasay=giris.nextInt();

        System.out.println("Simit adedini giriniz=");
        simitsay=giris.nextInt();

        kazanç=(ekmek*ekmeksay)+(poğaça*poğaçasay)+(simit*simitsay);
        vergi=kazanç*0.18;

        System.out.println("Fırıncının kazancı ="+kazanç);
        System.out.println("Vergi="+vergi);













    }
}
