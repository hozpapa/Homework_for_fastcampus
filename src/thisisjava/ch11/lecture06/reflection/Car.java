package thisisjava.ch11.lecture06.reflection;

import java.util.Objects;

public class Car {
    private String model;
    private String owner;

    public Car() {

    }

    public Car(String model) {

        this.model =model;
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    private void setOwner(String owner) {
        this.owner = owner;
    }
}

