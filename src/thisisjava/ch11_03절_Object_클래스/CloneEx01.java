package thisisjava.ch11_03절_Object_클래스;

public class CloneEx01 {
    public static void main(String[] args) throws CloneNotSupportedException {
        MemberForCloneTest memberForCloneTest =
                new MemberForCloneTest("123","이름..","12345",15,false);



        System.out.println(memberForCloneTest.id);
        System.out.println(memberForCloneTest.name);
        System.out.println(memberForCloneTest.password);
        System.out.println(memberForCloneTest.age);
        System.out.println(memberForCloneTest.adult);

        MemberForCloneTest cl=memberForCloneTest.getMemberForCloneTest();

        cl.password="1234566666";
        System.out.println("-------------------------------");
        System.out.println(memberForCloneTest.password);

        System.out.println(cl.id);
        System.out.println(cl.name);
        System.out.println(cl.password);
        System.out.println(cl.age);
        System.out.println(cl.adult);
    }
}
