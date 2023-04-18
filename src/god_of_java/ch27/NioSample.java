package god_of_java.ch27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import static java.io.File.separator;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioSample {
    public static void main(String[] args) {
        NioSample sample=new NioSample();
        sample.basicWriteAndRead();
    }

    private void basicWriteAndRead() {
        String fileName="C:"+ File.separator+"godofjava"+File.separator+"nio.txt";
        try{
            writeFile(fileName,"My first NIO Sample");
            readFile(fileName);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void readFile(String fileName) throws Exception {
        FileChannel channel=new FileInputStream(fileName).getChannel();
        ByteBuffer buffer=ByteBuffer.allocate(1024);
        channel.read(buffer);

        buffer.flip();
        while(buffer.hasRemaining()){
            System.out.print((char)buffer.get());
        }

        channel.close();
    }

    private void writeFile(String fileName, String data) throws Exception {
        FileChannel channel=new FileOutputStream(fileName).getChannel();
        byte[] byteData=data.getBytes();
        ByteBuffer buffer=ByteBuffer.wrap(byteData);
        channel.write(buffer);
        channel.close();
    }
}
