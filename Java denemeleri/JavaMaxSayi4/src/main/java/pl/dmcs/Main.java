package pl.dmcs;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz");
        int sayi1 = sc.nextInt();

        System.out.println("İkinci sayiyi giriniz");
        int sayi2 = sc.nextInt();

        System.out.println("Üçüncü sayiyi giriniz");
        int sayi3 = sc.nextInt();

        if (sayi1>sayi2&&sayi1>sayi3){
            System.out.println("En büyük sayi ="+ sayi1);
        } else if (sayi2>sayi1&&sayi2>sayi3) {
            System.out.println("En büyük sayi ="+ sayi2);

        }
        else {
            System.out.println("En büyük sayi ="+ sayi3);
        }
    }
}
