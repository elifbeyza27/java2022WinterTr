package day09_ternary;

import java.util.Scanner;

public class c03_ternary {
    public static void main(String[] args) {
        
        int sayi=1400;
        String sonuc = sayi >= 100 ? "sayi 3 basamaklı veya daha buyuk" : "sayi negatif veya 3 basamaktan kucuk";

        System.out.println("gurdıgınız sayı analizi:"+sonuc);
    }
}
