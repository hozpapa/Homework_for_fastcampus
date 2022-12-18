package thisisjava.ch11_03절_Object_클래스;

public class SmartPhone {

    private String company;
    private String os;

    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;

    }

    // Ctl+space
    @Override
    public String toString() {

        return company + ", " + os;

    }

    public String getOs() {
        return os;
    }

    public String getCompany() {
        return company;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}

