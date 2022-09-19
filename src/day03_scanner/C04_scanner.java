package day03_scanner;

import java.util.Scanner;

public class C04_scanner {

    public static void main(String[] args) {

        //sacnner kullanmak için üç adım takip ediyoruz
        // 1. adım kendimize bir scanner oluşturmak


        Scanner scan = new Scanner(System.in);// eşitliğin sağında yeni bir scanner oluşturulur
        //ve oluşturulan bu scanner scan variable na assign edilir

        //2. adım kullanıcıdan istediğimiz değeri girmesi için acıklayıcı bir bilgi yazdırır

        System.out.println("lütfen isminizi giriniz");

        //3.adım kullanıcının girdiği değeri uygun bir variable oluşturup kaydedin

        String kullanıcıismi = scan.nextLine();//sadece ilk kelimeyi alır

        System.out.println("kullanıcının girdiği isim:" + kullanıcıismi);

    }
}
