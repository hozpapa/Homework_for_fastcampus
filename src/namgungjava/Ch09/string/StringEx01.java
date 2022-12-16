package namgungjava.Ch09.string;

public class StringEx01 {
    public static void main(String[] args) {
        String str1 = "abcdefg";
        char[] chars =new char[str1.length()];
        for (int i = 0; i < str1.length(); i++) {
            chars[i]=str1.charAt(i);
            System.out.println(chars[i]);
        }
    }
}
