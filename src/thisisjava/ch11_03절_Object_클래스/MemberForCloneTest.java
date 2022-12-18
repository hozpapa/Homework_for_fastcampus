package thisisjava.ch11_03절_Object_클래스;

public class MemberForCloneTest implements Cloneable {
    public String id;
    public String name;
    public String password;
    public int age;
    public boolean adult;

    MemberForCloneTest(String id, String name, String password, int age, boolean adult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;

    }

    public MemberForCloneTest getMemberForCloneTest() throws CloneNotSupportedException {
        MemberForCloneTest cloned = null;
        cloned = (MemberForCloneTest) this.clone();

        return cloned;
    }
}
