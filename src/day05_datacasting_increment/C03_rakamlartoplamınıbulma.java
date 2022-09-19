package day05_datacasting_increment;

import java.util.Scanner;

public class C03_rakamlartoplamınıbulma {

    public static void main(String[] args) {
        //kullanıcıdan aldıgımız 4 basamaklı bir sayının
        //basamaklardaki rakamlar toplamını bulunuz

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 4 basamaklı bır tam sayı gırınız");
        int sayi=scan.nextInt();

        int rakam=0;
        int rakamlartoplamı=0;
        //1. adım r=0 rt=0 sayi 7532
        rakam=sayi%10; //2
        rakamlartoplamı +=rakam;//2
        sayi/=10;//753

        //2.adım r=2 rt=2 sayi=753
        rakam =sayi%10;//3
        rakamlartoplamı +=rakam;//5
        sayi/=10;//75
        //3.adım r=3 rt=5 sayi=75
        rakam =sayi%10;//5
        rakamlartoplamı+=rakam;//10
        sayi/=10;//7
        rakam =sayi%10;//7
        rakamlartoplamı+=rakam;//17
        sayi /=10;//0
        System.out.println("girdiğiniz sayının rakamlar toplamı"+rakamlartoplamı);










    }
}
