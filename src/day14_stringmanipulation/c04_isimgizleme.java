package day14_stringmanipulation;

import java.util.Locale;

public class c04_isimgizleme {
    public static void main(String[] args) {
        String isim="elıf";
        String soyisim="aydogdu";
        String kKNo="12345678912345612345";
        String yenisim=isim.substring(1).toUpperCase()+
                        isim.substring(1).replaceAll( "\\s",  "*");




    }
}
