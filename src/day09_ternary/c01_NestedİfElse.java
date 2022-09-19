package day09_ternary;

import java.util.Scanner;

public class c01_NestedİfElse {
    public static void main(String[] args) {
        //If statement birden fazla olursa hepsi birbirinden bagimsiz olur.
        // If cumlelerini
        //birbirine baglamayi da ogrenecegiz.
        //Eger Ali ararsa ona kizacagim.(aramazsa karar yok)
        //Eger aksam mac varsa onu izleriz.(mac yoksa karar yok)

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen dört basamaklı bir tamsayı girin" );;
        int sayi=scan.nextInt();



        if (sayi<1000||sayi>9999 ){
            System.out.println("lütfen 4 basamaklı pozitif bir tam sayi giriniz");



        }else if (sayi%5==0){  //sayi5 e tam bölünür

         if (sayi%10==0){

             System.out.println("5 e bölünen çift sayi");
         }else {
             
         }


        }else{ //4basamaklı ve 5 e bolunemiyor
            System.out.println("tekrar deneyiniz!");



        }
    }
}
