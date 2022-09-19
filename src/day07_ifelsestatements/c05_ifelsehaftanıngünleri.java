package day07_ifelsestatements;

import java.util.Locale;
import java.util.Scanner;

public class c05_ifelsehaftanıngünleri {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen gun ismini yazınız");
        String gunısmı=scan.next().toUpperCase();

        if (gunısmı.equals("PAZAR")||gunısmı.equals("CUMARTESI") ){
            System.out.println("gırdiğiniz gun haftasonu");

        }





    }
}
