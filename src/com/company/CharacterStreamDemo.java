package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * if you don't know the type of the Datei
 */
public class CharacterStreamDemo {
    public static void main(String[] args) throws IOException {


        FileReader readerStream = null;
        FileWriter writerStream = null;


        try {
            try {
                readerStream = new FileReader("C:\\Users\\sylva\\IdeaProjects\\Java_AdvanceKnoledge\\src\\com\\File\\Test1.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                writerStream = new FileWriter("C:\\Users\\sylva\\IdeaProjects\\Java_AdvanceKnoledge\\src\\com\\File\\Test2.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            // reads a byte at a time, if it reached end of the file,
            int content = 0;
            while (true) {
                try {
                    if (!((content = readerStream.read()) != -1)) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    writerStream.append((char) content);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            if (readerStream != null) {
                try {
                    readerStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (writerStream != null) {
                try {
                    writerStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

