package work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccesFileEx {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("Test10.txt", "rw")){
            int a = file.read();
            char b = (char)file.read();
            String s1 = file.readLine();
            System.out.println((char) a);
            System.out.println(b);
            System.out.println(s1);
            file.seek(20);
            char c = (char)file.read();
            System.out.println(c);
            long position = file.getFilePointer();
            System.out.println(position);

            file.seek(0);
            file.writeBytes("Hello");
            file.seek(file.length()-1);
            file.writeBytes(" \n                            Robert Lee Frost");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}