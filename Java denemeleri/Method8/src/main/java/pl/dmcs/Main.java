package pl.dmcs;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("lütfen bir sayı giriniz");
        int sayi = sc.nextInt();

        System.out.printf("%d",sayi);
    }
}
