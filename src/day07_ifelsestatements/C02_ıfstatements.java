package day07_ifelsestatements;

public class C02_ıfstatements {

    public static void main(String[] args) {
        int a=10;
        int b=20;
        if (a<b &&b<100){
            System.out.println("isteğiniz gerceklesecek");
            System.out.println("body içindeki tüm kodlar çalısır");

        }
        if (a>0) System.out.println("suslu parantez olmazsa sadece bır satır calısır ");
        //bir if cumlesının daha anlasılır olmasını istiyorsanız
        System.out.println("2.satırda calıstı");
    }
}
