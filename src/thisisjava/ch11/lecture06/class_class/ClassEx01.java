package thisisjava.ch11.lecture06.class_class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ClassEx01 {
    public static void main(String[] args) {

        Car myCar = new Car();
        Class clazz = myCar.getClass();

        Constructor[] constructors = clazz.getDeclaredConstructors();
        Field[] fields = clazz.getDeclaredFields();
        Method[] methods = clazz.getDeclaredMethods();

        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getPackage().getName());
        System.out.println(clazz.getPackageName());
        System.out.println(Arrays.deepToString(constructors));
        System.out.println(Arrays.deepToString(fields));
        System.out.println(Arrays.deepToString(methods));


        // forName를 이용

        try {
            Class clazz2 = Class.forName("thisisjava.ch11.lecture06.class_class.ClassEx01.Car");
            System.out.println(clazz2.getName());
            System.out.println(clazz2.getSimpleName());
            System.out.println(clazz2.getPackage().getName());
            System.out.println(clazz2.getPackageName());
            System.out.println(Arrays.deepToString(constructors));
            System.out.println(Arrays.deepToString(fields));
            System.out.println(Arrays.deepToString(methods));


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
