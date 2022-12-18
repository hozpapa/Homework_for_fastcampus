package thisisjava.ch11_03절_Object_클래스;

import java.util.Date;


public class ToStringEx02 {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Date obj2 = new Date();

        System.out.println(obj1.toString());  // 동일한 결과       java.lang.Object@34ce8af7
        System.out.println(obj1);
        System.out.println(obj2.toString());  // 동일한 결과       Sun Dec 18 18:34:41 KST 2022
        System.out.println(obj2);





    }
}
