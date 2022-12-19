package thisisjava.ch11.lecture06.reflection;

public class ReflectionEx01 {
    public static void main(String[] args) throws Exception {
        Class clazz=Class.forName("thisisjava.ch11.lecture06.reflection.Car");

        System.out.println(clazz.getName());
    }
}
