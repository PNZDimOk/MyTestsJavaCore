package work_with_files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("Test.txt");
        File folder = new File("C:\\Users\\dima_\\OneDrive\\Desktop\\TEST");
        File noFile = new File("C:\\Users\\dima_\\OneDrive\\Desktop\\TEST\\test.txt");
        System.out.println("file.getAbsolutePath:"+file.getAbsolutePath());
        System.out.println("------------------------");
        System.out.println(folder.isAbsolute());
        System.out.println(file.isAbsolute());
        System.out.println("------------------------");
        System.out.println(folder.isDirectory());
        System.out.println(file.isDirectory());
        System.out.println("------------------------");
        System.out.println(file.exists());
        System.out.println(folder.exists());
        System.out.println(noFile.exists());
        System.out.println("------------------------");
        System.out.println(noFile.createNewFile());
        System.out.println(folder.mkdir());
        System.out.println("------------------------");
        System.out.println(file.length());
        System.out.println(folder.length());
        System.out.println("------------------------");
        System.out.println(noFile.delete());
        System.out.println("------------------------");
        File[] files = folder.listFiles();
        System.out.println(Arrays.toString(files));
        System.out.println(folder.listFiles());
        System.out.println("------------------------");
        System.out.println(file.isHidden());
        System.out.println(folder.isHidden());
        System.out.println("------------------------");
        System.out.println(file.canRead());
        System.out.println(file.canExecute());
        System.out.println("------------------------");



    }
}
