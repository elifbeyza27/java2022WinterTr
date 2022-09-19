package day06_concatenationOperators;

public class C02_mantıkoperatorleri {
    public static void main(String[] args) {
        System.out.println(5+2==8);

        boolean sonuc1=5>4 && 7<9 && 6+3==9&&5+2!=8;
        System.out.println(sonuc1);
        boolean sonuc2=5>4&&7>9&&6+3==9&&5+2!=8;
        System.out.println(sonuc2);
        boolean sonuc3=5>4&7>9&6+3==9&5+2!=8;
        System.out.println(sonuc3);//false
        //&& ile & arasındaki fark
        int sayi3=15;
        System.out.println(10<sayi3  &&  sayi3<20);


        int sayi4=5;
        System.out.println(sayi3<10&& sayi3>20);

    }
}
