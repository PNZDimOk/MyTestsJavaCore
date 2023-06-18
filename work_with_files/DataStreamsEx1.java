package work_with_files;

import java.io.*;

public class DataStreamsEx1 {
    public static void main(String[] args) {
        try(DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("MyTest.bin"));
            DataInputStream inputStream = new DataInputStream(new FileInputStream("MyTest.bin"))){
            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeShort(120);
            outputStream.writeInt(500);
            outputStream.writeLong(1_000_000_000L);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readShort());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readLong());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
