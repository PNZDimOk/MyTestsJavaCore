package nested_class.static_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;


    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
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
    static class Engine{
        int horsePower;
        static int countOfObj;

        @Override
        public String toString() {
            return "My Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            countOfObj++;
        }
    }
}

class Test{
    public static void main(String[] args) {
//        Car.Engine e = new Car.Engine(256);
//        System.out.println(e);
        Car car = new Car("red", 2,new Car.Engine(259));
        System.out.println(car);
    }
}




































