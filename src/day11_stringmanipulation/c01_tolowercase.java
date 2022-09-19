package day11_stringmanipulation;

import java.util.Locale;

public class c01_tolowercase {
    public static void main(String[] args) {
        String str="Java Hoştur";
        //str.charAt(5);
        System.out.println(str.toLowerCase().charAt(8));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));

    }
}
