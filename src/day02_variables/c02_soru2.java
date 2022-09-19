package day02_variables;

public class c02_soru2 {
    public static void main(String[] args) {
//verilen sayi1 ve sayi2 variablelarının degerlerini 3.bir variable olmadan degiştiren bir program yazınız

        int sayi1=10;
        int sayi2=20;
        System.out.println("sayi1:"+sayi1+"\t sayi2:"+sayi2);
sayi1=sayi1+sayi2;
sayi2=sayi1-sayi2;
sayi1=sayi1-sayi2;
        System.out.println("sayi1:"+sayi1+"\t sayi2:"+sayi2);











    }
}
