package day04_datacasting_increment;

import java.util.Scanner;

public class C01_scanner {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz...");
        char ilkharf=scan.next().charAt(0);
        //charAt methodu parametre olarak yazdığımız indexdeki charı bize getirir

        System.out.println("girdiğiniz ismin ilk harfi:"+ilkharf);

    }
}
