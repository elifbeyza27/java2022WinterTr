package day07_ifelsestatements;

import java.util.Scanner;

public class c03_tekçift {

    public static void main(String[] args) {
        //kullanıcıdan bir tam sayı isteyin
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen bir tam sayı girin");
        int sayi=scan.nextInt();

        if (sayi%2==0){

            System.out.println("girilen sayi çift sayi");



        }
        if (sayi%2!=0){
            System.out.println("girilen sayı tek sayı");
        }

        if (sayi%2==0){

            System.out.println("girdiğiniz sayı cıft sayı");

        }



    }
}
