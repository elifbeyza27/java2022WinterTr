package day05_datacasting_increment;

import java.util.Locale;

public class C04_wapperclass {

    public static void main(String[] args) {


        //primitive data turu ile non -primitive arasındaki farklar nelerdir?
        String str ="java";
        int sayi=10;
        System.out.println(str.toUpperCase());
        System.out.println(str);
        //non-primitive data türleri data depolamak yanında bir çok faydalı methoda sahiptir
        //ancak primitive data türlerinin boyle bir ozelliği yoktur
        //primitive data turleri sadece degerleri saklarlar

        //primitive data türleri içinde bazı methodlar gerekli oldugunda
        //java ara bır cozum uretmiştir
        //java her bir primitive data turunu, non-primitive olarak kullanabilmek için
        //ozel classlar olusturmus ve bunlara wrapper class adını vermiştir

        double sayi2=20.5;
        //sayi2 primitive oldugundan sayi2. dediğimizde hiç bir method gelmez
        Double sayi3=15.2;
        //sayi3 wrapper class olan Double classını kullandıgından
        //sayi3. dediğimizde bircok method gelir

    }
}
