package day02_variables;

public class C03_variables {

    public static void main(String[] args) {

    String ogrenciIsmi="Ramazan";

    ogrenciIsmi="Kıymet";


    //bir variable declare edildikten sonra istediğimiz kadar deger degişimi yapabiliriz
    //ancak declare edilen bir variable tekrar declare edilemez

        String isim,soyisim,dogumYeri;
        isim="hasan";
        soyisim="aydogdu";
        dogumYeri="nigde";
        System.out.println(dogumYeri);
        System.out.println(soyisim);
        System.out.println(isim);



        String tcNo="27586941978";

        System.out.println(tcNo);

      //string non-primitive oldugu icin biz sadece data saklamak degil
      //ekstra bazi ozellikleri de kullanabiliyoruz
      //eger tc no , okul numarası veya tel numarası gibi
      //kendisi sayısal olan ancak matamatiksel bir işlemde kullanılmayan
      //degerler icin de string kullanılabilir

      String harf="h";
      char harf2='h';

      //bu ikisi icinde aynı durum gecerli
        // ben h harfi icin bir variable i char olarak da olusturabilirim string olarak da olusturabilirim
        //eger sadece saklayacak char lullanılabilir ama
        // string'in ozelliklerinden istifade etmek icin string olarak tanımlamak daha avantajlı olabilir




    }
}
