package thisisjava.ch11_03절_Object_클래스;

public class MemberEx01 {
    public static void main(String[] args) {

        Member m1=new Member("blue");
        Member m2=new Member("blue");
        Member m3=new Member("red");

        if (m1==m2)
            System.out.println("true");
        else System.out.println("false");

        if (m1.equals(m2))
            System.out.println("true");
        else System.out.println("false");
    }
}
