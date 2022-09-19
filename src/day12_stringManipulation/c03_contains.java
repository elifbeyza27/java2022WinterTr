package day12_stringManipulation;

public class c03_contains {
    public static void main(String[] args) {
        String email ="elifbeyza10907@gmail.com";
        String arananKelime="@gmail.com";
        if (!email.contains(arananKelime)){
            System.out.println("lütfen gmail adresi giriniz");

        }else if(email.lastIndexOf(arananKelime)==email.length()-10){
            System.out.println("email adresiniz kaydedildi");

        }else{
            System.out.println("lütfen yazımı kontrol ediniz");
        }
    }
}
