package day20_scope_Arrays;

public class C01_İnstanceVariables {
    int sayi;
    String bransIsmi="java";
    boolean okulAcikMİ;

    public static void main(String[] args) {
        //sayi=10; sayi variable i static olmadıgı için main methodu direk kullanamaz
        //instance variable static methodlardan ulaşabilmek için obje oluşturmamız gerekir
        C01_İnstanceVariables obj1=new C01_İnstanceVariables();
        System.out.println(obj1.sayi);
        obj1.sayi=10;
        System.out.println(obj1.sayi);
        obj1.bransIsmi="SQL";
        System.out.println(obj1.okulAcikMİ);


        C01_İnstanceVariables obj2=new C01_İnstanceVariables();
        System.out.println(obj2.sayi);
        System.out.println(obj2.bransIsmi);


    }
}
