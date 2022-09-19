package day08_ifelselfstatenebts;

import java.util.Scanner;

public class c03_sayıkontrol {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen iki sayı girin");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        //sayıların ikiside pozitif ise sayıların toplamını yazdırın
        if (sayi1>0 && sayi2>0){
            System.out.println("girdiğiniz iki sayı da pozitif oldugundan toplamları="+(sayi1+sayi2));

        }else if (sayi1<0&& sayi2<0){
            System.out.println("girdiğiniz iki sayı da pozitif oldugundan çarpımları="+(sayi1*sayi2));

        }else if (sayi1*sayi2<0){
            System.out.println("farklı işaretlerde işlem yapamazsın");


        }else {
            System.out.println("sayılardan sıfıra eşit olan varsa sıfır carpmaya gore yutan elemandır");
        }

        }
}