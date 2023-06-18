package work_with_files.prog1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes","red");
        Car car2 = new Car("BMW", "Black");
        Employee emp1 = new Employee("Dmitrii","Koshelev", "IT", 27,car1);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees2.bin"))){
            outputStream.writeObject(emp1);
            System.out.println("Done!!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
