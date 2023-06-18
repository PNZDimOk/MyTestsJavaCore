package lambda;
import java.util.ArrayList;
import java.util.function.*;

public class TestSupplier {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier){
        ArrayList<Car> al = new ArrayList<>();
        for (int i =0; i<3;i++){
            al.add(carSupplier.get());
        }
        return al;
    }
    public static void chadgeCar(Car car, Consumer<Car> carConsumer){
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(()->
                new Car("Nissan","Silver",1.6));

        System.out.println(ourCars);

        chadgeCar(ourCars.get(0),
                car -> car.engine=2.4);
        chadgeCar(ourCars.get(1),
                car -> car.color="red");
        System.out.println(ourCars);
    }
}

class Car{
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
