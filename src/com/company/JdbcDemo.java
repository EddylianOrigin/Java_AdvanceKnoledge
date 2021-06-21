package com.company;

import com.sun.jdi.connect.spi.Connection;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
    public static void main(String[] args) throws SQLException, IOException {
        // Creating the connection
        String url = "jdbc:postgresql://localhost/test";
        Connection conn = null;

        int rollno = 2;
        String name = "Jane";
        int age = 22;
        String sql = "insert into student(rollno, name, age)" + "values(" + rollno + ","+ name + "," + age +")";
                try{
                    conn = (Connection) DriverManager.getConnection(url,"postgres", "postgres");

                    Statement st = ((java.sql.Connection) conn).createStatement();
                    int m = st.executeUpdate(sql);
                    if(m==1)
                        System.out.println("inserted successfully : "+ sql);
                    else
                        System.out.println("insertion failed");
                } catch (Exception ex){
                    System.err.println(ex);
                } finally{
                     conn.close();
                }
    }
}
/**
 * dont forget to add the jar datei zu der Librairies
 */