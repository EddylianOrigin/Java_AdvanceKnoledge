package com.company;

import java.io.*;

public class SerDeserDemo {
    public static void main(String[] args) {
        Student  student = new Student("John", 25,"23 East, California");
        student.setX(10);

        String filename = "C:\\Users\\sylva\\IdeaProjects\\Java_AdvanceKnoledge\\src\\com\\File\\Test.txt";
        FileOutputStream fileOut;
        ObjectOutputStream objOut;
        // Serialization bei serialization the classtypinformation is lost
        try{
            fileOut = new FileOutputStream(filename);
            objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(student);

            objOut.close();
            fileOut.close();

            System.out.println("Object has been serialized: \n" + student);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IOException is caught");
            e.printStackTrace();
        }

        //Deserialization
        FileInputStream fileIn;
        ObjectInputStream objIn;
        try{
            fileIn = new FileInputStream(filename);
            objIn = new ObjectInputStream(fileIn);

            Student object = (Student) objIn.readObject();

            System.out.println("Object has been deseialized: \n" + object);
            System.out.println("THe deserialized value of x is: " + object.getX());// it will become 0 because they don't have transfert od data cause transient
            objIn.close();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
