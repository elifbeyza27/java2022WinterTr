
package day15_methodcreation;

import java.util.Scanner;

public class c04{
    public static void main(String[] args) {
        //kullanıcıdan bir kelime isteyin
        //eger kelime 3 harften kısa ise "kelime çok kısa" yazdırın
        // eger kelime 3 4 veya 5 harfli ise harf sayısını ve kelimenın tersten yazılısını yazdırın
        // eger 5 harften uzunsa kelime çok uzun yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String kelime=scan.next();
        int harfsayısı=kelime.length();

        if (harfsayısı<3) {
            System.out.println("kelime çok kısa");
        }else if (harfsayısı==3) {
            ucharfitersinecevir(kelime);

        }else if (harfsayısı==4) {
            dortharfitersinecevir(kelime);


        }else if (harfsayısı==5) {
            besharfitersinecevir(kelime);


        }else {
            System.out.println("kelime çok uzun");


        }
    }

    public static void besharfitersinecevir(String kelime) {
        String terskelime=kelime.substring(4)+
                kelime.substring(3,4)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);

        System.out.println("girdiğiniz kelimedeki harf sayısı :5");
        System.out.println("kelimenın tersten yazılışı :" +terskelime);

    }

    public static void dortharfitersinecevir(String kelime) {
        String terskelime=kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiğiniz kelimedeki harf sayısı :4");
        System.out.println("kelimenın tersten yazılışı :" +terskelime);

    }

    public static void ucharfitersinecevir(String kelime) {

        String terskelime=kelime.substring(2)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiğiniz kelimedeki harf sayısı :3");
        System.out.println("kelimenın tersten yazılışı :" +terskelime);



    }
}

