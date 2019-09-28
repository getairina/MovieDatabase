package com.UG;

import java.sql.Connection;
import java.sql.DriverManager;


public class Main {

    public static void main(String[] args) {
        Connection connection; // used to open a connection to DB
        try {
            connection = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306",
                            "root",
                            "Ritamax54");
            System.out.println("Connection succesfully");
            }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("");
        }
    }
}
