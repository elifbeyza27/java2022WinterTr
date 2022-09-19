package day10_switch_String;

import java.util.Scanner;

public class c01_switch {
    public static void main(String[] args) {
        //kullanıcıdan sayı olarak ay numarasını alıp
        //istenen ay ismini yazdıran bir program yazdırınız
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen kacıncı ay oldugunu giriniz");
        int ayNo=scan.nextInt();
        //7bu soruyu if else ile yapabiriz ama art arda 12 if else cok kalabalık ve anlasılması güç olur
        //bunun yerine switch -case yapısını kullanırız
        switch(ayNo) {
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("şubat");
                break;

            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayıs");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("ağustos");
                break;
            case 9:
                System.out.println("eylül");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasım");
                break;
            case 12:
                System.out.println("aralık");
            default:
                System.out.println("lütfen gecerli bir ay numarası giriniz");





        }
    }
}
