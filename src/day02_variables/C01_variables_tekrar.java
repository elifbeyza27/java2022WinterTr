package day02_variables;

import static java.lang.System.*;

public class C01_variables_tekrar {
    public static void main(String[] args) {
        //variable=bellekte ayrılmış olan deponun adı(değişken)
        //assignment=varolan bir variable değer atmaya denir
        //main= javanın çalışmaya başladığı giriştir
        // class= yazdığım kodun class oldugunu belirtir
        //myFirstClass=oluşturduğum classın ismidir.istediğimiz ismi verebiliriz ama isleme uygun isim omasına dikkat edilir
        //body=() kısımdan kalan kodlarımı yazdığım bölümdür
        //int level=5;
        out.println("level");// int=methodun ne ürettiğini ve bize dondurduğunu belirtir
        out.println("selamlar");
        out.println("ben bunu bakmadan yazıyorum");
        out.println("denemelif");
        //level=5;
        out.println("level");
        //java da iki tip data kullanılır
        //primitive data types=boolean,char,byte,short,int,long,float ve double
        //non-primitive data types=string
        //boolean=ikiye ayrılır true ve false diye
        //expensive=true
        //cold=false
        //boolean ögrenciMi=true;
        // boolean ögrenciMi=false;
        char sayi = '5';
        char harf = 'E';


        out.println(harf);
        out.println(sayi);
        String tcNo = "12345678912";
        out.println(tcNo);
        String isim = "beyza";

        int i;
        for (i = 1; i < 6; i++) ;
        out.println(i + "-");
    }


    }

