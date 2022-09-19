package day04_datacasting_increment;

public class C02_autowidening {//(otomatik genişletme)

    public static void main(String[] args) {

        byte sayi1=44;

        System.out.println(sayi1);

        short sayi2=sayi1;//eşitliğin solu short,sağı ise byte

        System.out.println(sayi2);
        double sayi3=sayi2;
        System.out.println(sayi3);




    }
}