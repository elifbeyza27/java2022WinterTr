package day10_switch_String;

public class c03_concate {
    public static void main(String[] args) {

        String str1="java";
        String str2="candır";
        // java candır yazdır
        System.out.println(str1 +" "+str2);
        String cumle=str1.concat(str2);
        cumle=str1.concat(" ").concat(str2);//concat:string verileri birleştirme işlemleri için kullanılır
        System.out.println(cumle);

    }
}
