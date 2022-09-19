package day14_stringmanipulation;

public class c03_strinsayıtoplama {
    public static void main(String[] args) {
        String str1="$13.99";
        String str2="$10.55";
        str1=str1.replaceAll(    "\\D",  "");//replaceall:hepsini değiştir
        str2=str2.replaceAll(   "\\D",  "");
        double str1sayi=Double.valueOf(str1);
        double str2sayi=Double.valueOf(str2);

        double sonuc=(str1sayi+str2sayi)/100;
        System.out.println("verilen string sayıların toplamı:$" +sonuc );
    }
}
