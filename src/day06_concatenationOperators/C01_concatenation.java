package day06_concatenationOperators;

public class C01_concatenation {

    public static void main(String[] args) {
         String str1="java";
         String str2="guzel";
         int sayi1=5;
         int sayi2=3;
        System.out.println(str1+sayi1+str2);
        //2guzel15
        System.out.println(sayi1-sayi2+str2+sayi1*sayi2);
        //8guzel8
        System.out.println(sayi1+sayi2+str2+sayi1+sayi2);
        //java22

        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));
        //53guzel
        System.out.println(sayi1+(sayi2+str2));
        System.out.println(""+sayi1+sayi2+str2);
        //eger tamamen sayılardan oluşan bir string varsa ve biz bunu int a cevirmek istersek
        //ınteger.valueOf(str)






    }
}
