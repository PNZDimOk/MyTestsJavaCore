package work_with_files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        try {
            reader = new FileReader("C:\\Users\\dima_\\OneDrive\\Desktop\\test1.txt");
            int character;
            while ((character=reader.read())!=-1){
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("DONE");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
    }
}
