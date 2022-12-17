package thisisjava.ch11_16_자바타임패키지;

import java.time.*;

public class LocalDateTimeEx01 {
    public static void main(String[] args) {


        LocalDate currDate =LocalDate.now();

        System.out.println(currDate.toString());
        System.out.println(currDate);

        LocalDate targetDate=LocalDate.of(2024,5,10);
        System.out.println(targetDate);

        LocalTime currTime =LocalTime.now();
        LocalTime targetTime=LocalTime.of(10,20,30);
        System.out.println(targetTime);
        LocalTime targetTime2=LocalTime.of(23,20,30,20);
        System.out.println(targetTime2);

        LocalDateTime ldt= LocalDateTime.now();
        System.out.println(ldt);
        LocalDateTime ldt2= LocalDateTime.of(2022,10,15,10,10,5,5);
        System.out.println(ldt2);
        LocalDateTime ldt3= LocalDateTime.of(2022,12,13,13,13,13);

        ZonedDateTime zdt=ZonedDateTime.now();
        System.out.println(zdt);
        ZonedDateTime zdt1=ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println(zdt1);


    }
}
