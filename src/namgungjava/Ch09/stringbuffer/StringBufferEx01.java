package namgungjava.Ch09.stringbuffer;

public class StringBufferEx01 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("abc");
        System.out.println(stringBuffer);
        stringBuffer.append('a');
        System.out.println(stringBuffer);

        stringBuffer.append(true);
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.charAt(3));
        System.out.println(stringBuffer.delete(2,3));
        System.out.println(stringBuffer);
    }
}
