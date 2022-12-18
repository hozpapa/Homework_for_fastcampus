package thisisjava.ch11_03절_Object_클래스;

public class SmartPhoneEx01 {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Samsung", "android");
        System.out.println(smartPhone);
        System.out.println(smartPhone.getOs());
        System.out.println(smartPhone.getCompany());


        smartPhone.setCompany("SamSung2");
        smartPhone.setOs("ANDR");
        System.out.println(smartPhone);
        System.out.println(smartPhone.getOs());
        System.out.println(smartPhone.getCompany());

        String str1 = smartPhone.toString();
        System.out.println(str1); // hashcode 대신에 재정의된 toString() 메서드가 사용되어 문자열 출력

        /*
        Samsung, android
        android
        Samsung
        SamSung2, ANDR
        ANDR
        SamSung2
        SamSung2, ANDR
        */
    }
}
