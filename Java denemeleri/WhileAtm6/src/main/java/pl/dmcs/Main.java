package pl.dmcs;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String islemler= "1.İşlem: Bakiye kontrolü\n"+
                         "2.İşlem: Para çekme\n"+
                         "3.İşlem: Para yatırma\n"+
                         "Çıkış için e ye basınız";
        System.out.println("******************************************");
        System.out.println(islemler);
        System.out.println("******************************************");

        int bakiye=1000;

        while(true){

            System.out.println("Lütfen yapıcağınız işlemi seçiniz");
            islemler= sc.nextLine();

            if(islemler.equals("e")){
                System.out.println("Çıkış yapılıyor");
                break;
            }
            else if(islemler.equals("1")){
                System.out.println("Bakiyeniz= "+bakiye);
            }
            else if(islemler.equals("2")){
                System.out.println("Çekmek istediğiniz tutar nedir?");
                int tutar=sc.nextInt();
                sc.nextLine();
                if(tutar>bakiye){
                    System.out.println("Yetersiz bakiye");
                }
                else{
                    bakiye=bakiye-tutar;
                    System.out.println("Yeni bakiyeniz= "+bakiye);
                }
            }
            else if(islemler.equals("3")){
                System.out.println("Yatırmak istediğiniz tutar nedir?");
                int tutar=sc.nextInt();
                sc.nextLine();
                System.out.println("Yeni bakiyeniz= "+(bakiye+tutar));
            }
            else {
                System.out.println("Yanlış bir seçim yaptınız");
            }

        }


    }
}
