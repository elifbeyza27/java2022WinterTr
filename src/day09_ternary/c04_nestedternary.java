package day09_ternary;

public class c04_nestedternary {
    public static void main(String[] args) {

        int sayi=13;
        if (sayi>=0){
            if (sayi%2==0){
                System.out.println("sayi pozitif çift sayi");
            }else{
                System.out.println("sayi pozitif tek sayi");
            }
            }else{
            if (sayi<-100){

                System.out.println("sayi-100 den kücük negatif sayi");


            }else{
                System.out.println("sayi-100 den büyük negatif sayi");
            }

        }
        String sonuc=sayi>=0?(sayi%2==0?"pozitif çift sayi":"pozitif tek sayi"):(sayi<-100?"-100 den kucuk negatif sayi":"-100 den buyuk negatif sayi");
        System.out.println(sonuc);
    }

}
