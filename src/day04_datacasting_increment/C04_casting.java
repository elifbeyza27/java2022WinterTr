package day04_datacasting_increment;

public class C04_casting {

    public static void main(String[] args) {

        double myDouble=9.78;
        int myInt =(int) myDouble;
        System.out.println(myDouble);
        System.out.println(myInt);

        int sayi1=879;
        double sayi2=10;

        double sayi3=sayi1/sayi2;
        System.out.println(sayi3);

       // int sayi4=sayi1/sayi2;

        int sayi5=140;
        byte sayi6=(byte) sayi5;
        System.out.println(sayi6);

        sayi5=130;
        sayi6=(byte) sayi5;
        System.out.println(sayi6);

        sayi5=55;
        sayi6=(byte) sayi5;
        System.out.println(sayi6);


    }
}
