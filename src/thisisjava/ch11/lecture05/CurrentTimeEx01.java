package thisisjava.ch11.lecture05;

public class CurrentTimeEx01 {
    public static void main(String[] args) {

        long time1 = System.nanoTime();

        long sum=0;
        for (int i = 0; i < 1000000000; i++) {
            sum+=i;
        }

        long time2 =System.nanoTime();

        System.out.println(time1);
        System.out.println(time2);
        System.out.println((double)(time2-time1)/1000000000);




    }
}
