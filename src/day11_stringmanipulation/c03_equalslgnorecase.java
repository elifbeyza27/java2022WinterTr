package day11_stringmanipulation;

import java.util.Scanner;

public class c03_equalslgnorecase {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("derse katılmak ister misiniz? \nevet veya hayır yazınız");
        String cevap=scan.next();
        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabınız:"+cevap+"derse katılımınız onaylanmıstır");
        }else if (cevap.equalsIgnoreCase("hayır"));
        System.out.println("cevabınız:"+cevap+"sonraki derslerimize bekleriz");



    }
}
