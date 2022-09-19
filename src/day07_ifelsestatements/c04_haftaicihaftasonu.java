package day07_ifelsestatements;

import java.util.Locale;
import java.util.Scanner;

public class c04_haftaicihaftasonu {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen gun ismini yazınız");
        String gunısmı=scan.next().toLowerCase();

        if (gunısmı.equals("pazar")||gunısmı.equals("cumartesi") ){
            System.out.println("gırdiğiniz gun haftasonu");
        }
if (gunısmı.equals("pazartesi")||gunısmı.equals("sali")||
        gunısmı.equals("carsamba")||gunısmı.equals("persembe")||
                gunısmı.equals("cuma")){
    System.out.println("girdiğiniz gun hafta ici");




                };



    }
}
