package namgungjava.Ch09.string;

public class StringToNumberEx01 {
    public static void main(String[] args) {

// 문자열을 숫자로

// 1. parse-- 를 이용
        System.out.println(Boolean.parseBoolean("false"));
        System.out.println(Integer.parseInt("100"));
        System.out.println();

// 2. valueOf 를 사용
        System.out.println(Integer.valueOf("100"));
        System.out.println(Double.valueOf("100"));
    }
}
