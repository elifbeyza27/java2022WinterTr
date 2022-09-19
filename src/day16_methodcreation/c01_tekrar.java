package day16_methodcreation;

import java.util.Scanner;

public class c01_tekrar {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen dort basamaklı bir tam sayı giriniz");
        int sayi=scan.nextInt();


        if (sayi<1000||sayi>9999){
            System.out.println("lütfen dort basamaklı pozitif bir tam sayı giriniz");
        }else if(sayi%5==0){

        }if (sayi%10==0){
            System.out.println("5 e bölünen çift sayi");

        }else{

        }
    }
}
