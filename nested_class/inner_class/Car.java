package nested_class.inner_class;

public class Car {
    String color;
    int doorCount;
    Car.Engine engine;


    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);
    }
    public void setEngine(Engine engine){
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }
    public class Engine{
        int horsePower;

        @Override
        public String toString() {
            return "My Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }
    }
}

class Test{
    public static void main(String[] args) {
        Car car = new Car("Black", 4);
        Car.Engine engine = car.new Engine(149);
        car.setEngine(engine);
        System.out.println(car);
        System.out.println(engine);
    }
}
