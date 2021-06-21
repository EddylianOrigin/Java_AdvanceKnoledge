package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * if you don't know the type of the Datei
 */
public class ByteStreamExample {
    public static void main(String[] args) {


        FileInputStream inStream = null;
        FileOutputStream outStream = null;


try
        {
            try {
                inStream = new FileInputStream("C:\\Users\\sylva\\OneDrive\\Dokumente\\entwicklung\\JAVA\\Test1.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                outStream = new FileOutputStream("C:\\Users\\sylva\\OneDrive\\Dokumente\\entwicklung\\JAVA\\Test2.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            // reads a byte at a time, if it reached end of the file,
            int content = 0;
            while (true) {
                try {
                    if (!((content = inStream.read()) != -1)) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    outStream.write((byte) content);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
finally
        {
            if (inStream != null) {
                try {
                    inStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outStream != null) {
                try {
                    outStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
