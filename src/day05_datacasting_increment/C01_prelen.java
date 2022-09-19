package day05_datacasting_increment;

public class C01_prelen {

    public static void main(String[] args) {


        int sayi=10;
        //bu sayıyı bir arttırmak istersek
        sayi++;
        System.out.println(sayi);

        sayi++;
        System.out.println(sayi);
        // eger 11. ve 12. satırda yaptığım 2 işlemi tek satırda yaparsam
        //java iki işlemden önce hangisini yapacagını bilmek ister


        System.out.println(++sayi);
        System.out.println(sayi);
        System.out.println("post -increment satirinda "+sayi++);
        System.out.println("post increment satirindan sonra "+sayi);

        System.out.println("pre-increment satirinda"+ ++sayi);
        System.out.println("pre -incrementden sonra"+sayi);



    }
}
