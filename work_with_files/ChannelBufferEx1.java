package work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class ChannelBufferEx1 {
    public static void main(String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("Test10.txt", "rw");
        FileChannel channel = file.getChannel();){

            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder stih = new StringBuilder();
            int byteRead = channel.read(buffer);

            while (byteRead>0){
                System.out.println("Read "+byteRead);
                buffer.flip();
                while (buffer.hasRemaining()){
                    stih.append((char)buffer.get());
                }
                System.out.println(stih);
                buffer.clear();
                byteRead = channel.read(buffer);

            }
            System.out.println(stih);

            String text = "\n \n Hello from buffer ";
//            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
//            buffer2.put(text.getBytes());
//            buffer2.flip();
//            channel.write(buffer2);
            ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes());
            channel.write(buffer2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
