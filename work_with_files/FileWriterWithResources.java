package work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterWithResources {
    public static void main(String[] args) throws IOException {
        String str = "Dmitrii Koshelev 27 old\n";
        String strHello = "Hello\n";
        try(FileWriter writer = new FileWriter("C:\\Users\\dima_\\OneDrive\\Desktop\\test1.txt", true)) {

            writer.write(str);
            writer.write(strHello);

            System.out.println("Done!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
