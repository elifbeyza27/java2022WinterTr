package day05_datacasting_increment;

public class C02_prelncrement {

    public static void main(String[] args) {

        int a=15;
        int b=a++;
        System.out.println(b);

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        sayi2= sayi1++;
        System.out.println(sayi1+ ","+sayi2+","+sayi3);

        sayi3=++sayi1;

        System.out.println(sayi1+ ","+sayi2+","+sayi3);
        System.out.println(sayi3++);//önce yazdıracak sonra artıracak
                                    //önce 12 yazdıracak sonra sayi3=13
        System.out.println(--sayi2);//önce azalt sonra yazdır
                                    //önce sayi2=9 sonra sayi2 nin son degeri yani 9 yazdırır






    }
}
