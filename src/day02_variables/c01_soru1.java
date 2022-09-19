package day02_variables;

public class c01_soru1 {
    public static <swap> void main(String[] args) {
       // verilen sayi1 ve sayi2 variablelerin degerlerini degiştiren(swap)bir program yazınız


    int sayi1=10;
    int sayi2=20;
        System.out.println("swap'dan önce sayi1:"+sayi1+",sayi2:"+sayi2);
        int temp=sayi1;


        sayi1=sayi2;
        sayi2=temp;
        System.out.println("swap'dan sonra sayi1:"+sayi1+",sayi2:"+sayi2);







    }
}
