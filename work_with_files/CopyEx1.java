package work_with_files;

import java.io.*;

public class CopyEx1 {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("C:\\Users\\dima_\\OneDrive\\Изображения\\ET7Hc-us6Zw.jpg");
            FileOutputStream outputStream = new FileOutputStream("TestJoker.jpg")
        ) {
            int i;
            while ((i=inputStream.read())!=-1){
                outputStream.write(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
