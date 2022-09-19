package day15_methodcreation;

import java.util.Scanner;

public class C02_METHODCREATİON {
    public static void main(String[] args) {

        //kullanıcıdan bir kelime isteyin
        //eger kelime 3 harften kısa ise "kelime çok kısa" yazdırın
        // eger kelime 3 4 veya 5 harfli ise harf sayısını ve kelimenın tersten yazılısını yazdırın
        // eger 5 harften uzunsa kelime çok uzun yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String kelime=scan.next();
        String terskelime="";

       if (kelime.length()<3){
           System.out.println("kelime çok kısa");

        }else if (kelime.length()<=5){

           if (kelime.length()==3){
               terskelime=kelime.substring(2)+
                         kelime.substring(1,2)+
                       kelime.substring(0,1);

           }else if (kelime.length()==4){
               terskelime=kelime.substring(3)+
                       kelime.substring(2,3)+
                       kelime.substring(1,2)+
                       kelime.substring(0,1);

           }else{
               terskelime=kelime.substring(4)+
                       kelime.substring(3,4)+
                       kelime.substring(2,3)+
                       kelime.substring(1,2)+
                       kelime.substring(0,1);

           }
           System.out.println("girdiğiniz kelimedeki harf sayısı :" +kelime.length());
           System.out.println("kelimenın tersten yazılışı :" +terskelime);

        }else{
           System.out.println("kelime çok uzun");

        }



    }
}
