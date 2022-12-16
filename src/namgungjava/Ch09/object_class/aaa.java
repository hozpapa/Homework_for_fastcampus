package namgungjava.Ch09.object_class;

import java.util.Arrays;

public class aaa {
    public static void main(String[] args) {
        String s1 = "abcdefg";
        boolean b1 =s1.contains("ab");
//        boolean b2 =s1.contains('b');
        String s2 = "abcdabcdabcd";
        String s3 =s2.replaceAll("ab","AB");
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1.startsWith("a"));
        char[] chAr ={'H','e','l'};

        String s4 =new String(chAr);
        System.out.println(s4);
        int a =s4.indexOf('e');
        System.out.println(a);
        System.out.println(s1.indexOf("b"));
        System.out.println(s1.indexOf('b',3));
        char[] chAr2 =s1.toCharArray();
        System.out.println(Arrays.toString(chAr2));

        for (int i = 0; i < chAr2.length; i++) {
            System.out.print(chAr2[i]);
        }
        System.out.println();
        System.out.println(chAr2);



    }
}
