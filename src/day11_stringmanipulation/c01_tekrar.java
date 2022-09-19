package day11_stringmanipulation;

import java.util.Locale;

public class c01_tekrar {
    public static void main(String[] args) {
      String str="ELİF HARİKA BİRİ";
        System.out.println(str.toUpperCase().charAt(5));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));

    }
}
