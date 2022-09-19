package day09_ternary;

import java.util.Scanner;

public class c02_Ternary {
    public static void main(String[] args) {


        //kullanıcıdan bir tam sayı alıp tek mi çift mi yazdıran bir kod yazdıralım
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen pozitif bir tam sayi giriniz");
        int sayi=scan.nextInt();
        if (sayi%2==0){
            System.out.println("sayi çift");
        }else{
            System.out.println("sayi tek");
        }

        System.out.println(sayi%2==0  ?"sayi çift":"sayi tek");

    }
}
