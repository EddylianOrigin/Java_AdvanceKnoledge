package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

//reading and writing with IO using Thread-Concept
public class NioExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("C:\\Users\\sylva\\IdeaProjects\\Java_AdvanceKnoledge\\src\\com\\File\\source.txt");
        FileChannel readChannel = fin.getChannel();//we handeln with file and not with socket (socketchannel), it is use for any kind of Communication
        ByteBuffer readBuffer = ByteBuffer.allocate(1024);
        int result = readChannel.read(readBuffer);
        System.out.println("file read successfully" + result);// it is locate in result;

        FileOutputStream fout = new FileOutputStream("C:\\Users\\sylva\\IdeaProjects\\Java_AdvanceKnoledge\\src\\com\\File\\dest.txt");
        FileChannel writeChannel = fout.getChannel();
        ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
        String message = "this is a string";

        writeBuffer.put(message.getBytes());
        writeBuffer.flip();
        writeChannel.write(writeBuffer);
        System.out.println("file written successfully");
    }
}
