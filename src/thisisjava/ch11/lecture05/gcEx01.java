package thisisjava.ch11.lecture05;


public class gcEx01 {
    public static void main(String[] args) {
        Employee em = new Employee(5);


        em =null;
        em = new Employee(6);
        em = new Employee(7);


    }
}
