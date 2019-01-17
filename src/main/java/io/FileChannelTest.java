package io;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * About:
 * Other:
 * Created: ruanting on 2018/12/29 11:19
 * Editored:
 */
public class FileChannelTest {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("E:\\niodata.txt", "rw");
        FileChannel rafChannel = raf.getChannel();

        ByteBuffer readBuffer = ByteBuffer.allocate(99);
//        int byteRead = rafChannel.read(readBuffer);
//        System.out.println("byteRead" + byteRead);
//        while (byteRead != -1) {
//            readBuffer.flip();
//            while (readBuffer.hasRemaining()) {
//                System.out.println((char) readBuffer.get());
//            }
//            readBuffer.clear();
//            byteRead = rafChannel.read(readBuffer);
//        }
//
        ByteBuffer writeBuffer = ByteBuffer.allocate(100);
        writeBuffer.put("writeBuffer input something".getBytes());
        writeBuffer.flip();

//        int byteRead = rafChannel.read(writeBuffer);
        rafChannel.write(writeBuffer, raf.length());

//        while (byteRead != -1) {
//            System.out.println("byteRead" + byteRead);
//
//            readBuffer.flip();
//            while (writeBuffer.hasRemaining()) {
//                System.out.println((char) writeBuffer.get());
//            }
//
//            readBuffer.clear();
//            byteRead = rafChannel.read(readBuffer);
//        }

        raf.close();
    }
}
