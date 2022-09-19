package day11_stringmanipulation;

public class c02_equals {
    public static void main(String[] args) {

        String str1="Ali Can";
        String str2="Ali" + "Can";
        System.out.println("str1:" + str1);
        System.out.println("str2:" + str2);
        System.out.println("== ile karsılastır:"+(str1==str2));
        System.out.println("equals ile karsılastır:"+str1.equals(str2));



    }
}
