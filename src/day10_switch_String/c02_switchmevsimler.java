package day10_switch_String;

import java.util.Scanner;

public class c02_switchmevsimler {
    public static void main(String[] args) {

        //kullanıcıdan kacıncı ay oldugunu alıp mevsimi yazdıran bir switch
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen kacıncı ay oldugunu giriniz");
        int ayNo=scan.nextInt();
        switch(ayNo) {

            case 12:
            case 1:
            case 2:
                System.out.println("kış");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("sonbahar");
                break;

            default:
                System.out.println("lütfen gecerli bir ay numarası giriniz");}



        }

    }