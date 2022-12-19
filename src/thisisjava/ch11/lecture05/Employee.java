package thisisjava.ch11.lecture05;

public class Employee {
    int eno;

    public Employee(int eno){
        this.eno=eno;
        System.out.println("Employee"+eno+" 생성");
    }

    @Override
    protected void finalize() throws Throwable {
//        super.finalize();
        System.out.println("Employee"+eno+" 제거");

    }
}
