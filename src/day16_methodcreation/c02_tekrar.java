package day16_methodcreation;

import java.util.Scanner;

public class c02_tekrar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen pozitif bir tam sayı girin");
        int sayi=scan.nextInt();
        if (sayi%2==0){
            System.out.println("sayi çift");
        }else{
            System.out.println("sayi tek");
        }

        System.out.println(sayi%2==0?"sayi çift":"sayi tek");

    }
}
