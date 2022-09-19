package day12_stringManipulation;

public class c02_lastindexof {
    public static void main(String[] args) {
        String cümle="java öğren yeni bir sayfa aç";
        String kelime="yeni";
        int ilkkullanım=cümle.indexOf(kelime);
        int sonkullanım=cümle.lastIndexOf(kelime);
        if (ilkkullanım==(-1)){
            System.out.println("girilen kelime cumlede kullanılmamış.");

        }else if (ilkkullanım==sonkullanım){
            System.out.println("girilen kelime cumlede 1 kere kullanılmış.");
        }else{
            System.out.println("girilen kelime cumlede 1'den fazla kullanılmış");
        }


    }
}
