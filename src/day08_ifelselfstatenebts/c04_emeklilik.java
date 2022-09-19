package day08_ifelselfstatenebts;

import java.util.Scanner;

public class c04_emeklilik {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi yazınız"+"kadın için K erkek için E harfini giriniz");
        char cinsiyet=scan.next().charAt(0);
        System.out.println("lütfen yaşınızı giriniz");
        double yas =scan.nextDouble();

        if (cinsiyet=='K'){

            if (yas<0 || yas>120){
                System.out.println("lütfen girdiginiz yas degerini kontrol edin");

            }else if (yas<60){
                System.out.println("emekli olamazsın daha"+(60-yas)+"yil calısman gerekir ");

            }else{
                System.out.println("emekeli olabilirsin");
            }


        }else if (cinsiyet=='E'){


            if (yas<0 || yas>120){
                System.out.println("lütfen girdiginiz yas degerini kontrol edin");

            }else if (yas<65){
                System.out.println("emekli olamazsın daha"+(65-yas)+"yil calısman gerekir ");

            }else{
                System.out.println("emekeli olabilirsin");
            }



        }else {


            System.out.println("lütfen cinsiyet için gecerli bir harf giriniz");
        }





    }
}
