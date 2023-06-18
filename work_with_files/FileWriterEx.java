package work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String str = "Dmitrii Koshelev 27 old\n";
        String strHello = "Hello\n";
        FileWriter writer = null;
        try {
            writer = new FileWriter("C:\\Users\\dima_\\OneDrive\\Desktop\\test1.txt", true);
//            for (int i = 0; i<str.length(); i++){
//                writer.write(str.charAt(i));
//            }
            writer.write(str);
            writer.write(strHello);

            System.out.println("Done!!!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }
    }
}
