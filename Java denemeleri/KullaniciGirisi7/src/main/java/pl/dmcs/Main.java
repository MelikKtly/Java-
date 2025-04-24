package pl.dmcs;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String kullanici = "Melik";
        String sifre="123";

        int giris_hakki=3;

        while(true){
            System.out.println("Lütfen kullanıcı adınızı giriniz");
            String kullanici_adi = sc.nextLine();

            System.out.println("Lütfen parolanızı giriniz");
            String parolan_adi = sc.nextLine();

            if (kullanici_adi.equals(kullanici) && parolan_adi.equals(sifre)){

                System.out.println("Hoşgeldiniz "+kullanici_adi);
                break;
            } else if (kullanici_adi.equals(kullanici) && !parolan_adi.equals(sifre)) {
                System.out.println("Şifreniz hatalı");
                giris_hakki--;

            } else if (!kullanici_adi.equals(kullanici) && parolan_adi.equals(sifre)) {
                System.out.println("Kullanıcı adınız hatalı");
                giris_hakki--;

            }else if (!kullanici_adi.equals(kullanici) && !parolan_adi.equals(sifre)){
                System.out.println("Kullanıcı adı ve şifreniz hatalı");
                giris_hakki--;
            }

            if (giris_hakki==0){
                System.out.println("Fazla hatalı giriş yapıldığı için işlem zaman aşımına uğramıştır.");
                break;
            }
        }



}
}
