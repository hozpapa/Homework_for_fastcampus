package thisisjava.ch11.lecture05;

public class ExitEx01 {
    public static void main(String[] args) {
        System.setSecurityManager(new SecurityManager() {   // 익명 클래스... 오버라이딩...
            @Override
            public void checkExit(int status) {
                if (status != 5) {
                    throw new SecurityException();
                }
            }
        });

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                System.exit(i);

            } catch (SecurityException e) {
            }

        }
    }
}
