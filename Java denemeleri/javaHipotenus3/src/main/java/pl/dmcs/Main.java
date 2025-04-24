package pl.dmcs;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("üçgenin bir kenarını giriniz");

        int a = sc.nextInt();

        System.out.println("üçgenin diğer kenarını giriniz");

        int b = sc.nextInt();

        double c = Math.sqrt(a * a + b * b);

        System.out.println("Hipotenüs = "+ c);
    }
}
