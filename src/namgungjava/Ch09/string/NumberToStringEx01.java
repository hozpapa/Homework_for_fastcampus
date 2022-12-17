package namgungjava.Ch09.string;

public class NumberToStringEx01 {
    public static void main(String[] args) {

        int i = 100;

        // 1.
        String str1 = "" + i;
        System.out.println(str1);
        System.out.println(i + "");

        // 2.
        String str2 = String.valueOf(i);
        System.out.println(str2);


    }
}
