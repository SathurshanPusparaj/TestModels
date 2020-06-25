package com.cloudbox.models_service.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class App {
    String password = "pass";

    public static void random(){
        Random  rand = new Random();
        System.out.println(rand.nextInt());
    }

    public String password(){
        final String password = "pass";
        return password;
    }

    public static void improperShutdown(String value) throws SQLException {
        Connection connection = DriverManager.getConnection(value);
        Statement statement = connection.createStatement();
    }
}