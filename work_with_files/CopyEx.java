package work_with_files;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\dima_\\OneDrive\\Desktop\\test1.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("Test.txt")))
        {
            int character;
//            while ((character=reader.read())!=-1){
//                writer.write(character);
//            }
            String line;
            while ((line = reader.readLine())!=null){
                writer.write(line);
                writer.write("\n");
            }
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
