package day12_stringManipulation;

public class c01_indexof {
    public static void main(String[] args) {
        String cümle="java öğren yeni bir sayfa aç";
        String kelime="bahadır";
        int ilkkullanım=cümle.indexOf(kelime);
        int ikincikullanım= cümle.indexOf(kelime,ilkkullanım+1);

        if (ilkkullanım==(-1)){
            System.out.println("girilen kelime cümlede kullanılmamış");

        }else if (ikincikullanım==(-1)){
            System.out.println("girilen kelime cumlede 1 kez kullanılmış ");
        }else {
            System.out.println("girilen kelime cumlede 1'den fazla kullanılmış");
        }


    }
}
