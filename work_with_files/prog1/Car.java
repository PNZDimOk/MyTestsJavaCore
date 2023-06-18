package work_with_files.prog1;

import java.io.Serializable;

public class Car implements Serializable {
    String model;
    String Color;

    public Car(String model, String color) {
        this.model = model;
        Color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", Color='" + Color + '\'' +
                '}';
    }
}
