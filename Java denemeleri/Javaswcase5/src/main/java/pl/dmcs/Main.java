package pl.dmcs;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen yapılacak işlemi seçin");
        System.out.println("1-Toplama\t2-Çıkarma\t3-Çarpma\t4-Bölme ");
        int seçenek= sc.nextInt();

        System.out.println("Lütfen işlem yapılacak sayıları seçin");
        int a=sc.nextInt();
        int b=sc.nextInt();


        switch (seçenek){
            case 1:
                System.out.println("Sonuç="+(a+b));
            break;
            case 2:
                System.out.println("Sonuç="+(a-b));
                break;
                case 3:
                    System.out.println("Sonuç="+(a*b));
                    break;
                    case 4:
                        System.out.println("Sonuç="+(a/b));
                        break;
            default:
                System.out.println("Yanlış seçenek seçtiniz");
        }
    }

}
