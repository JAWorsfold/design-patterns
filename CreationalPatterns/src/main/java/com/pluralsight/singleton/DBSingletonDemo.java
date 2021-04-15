package com.pluralsight.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBSingletonDemo {

    public static void main(String[] args) {
        DBSingleton instance = DBSingleton.getInstance();

        long timeStart;
        long timeEnd;

        // performance test
        timeStart = System.currentTimeMillis();
        Connection conn = instance.getConnection();
        timeEnd = System.currentTimeMillis();
        System.out.println("Time to instantiate instance: " + (timeEnd - timeStart));

        Statement sta;
        String sqlQuery = "CREATE TABLE Address (ID INT, StreetName VARCHAR(20), CITY VARCHAR(20))";
        try {
            sta = conn.createStatement();
            sta.executeUpdate(sqlQuery);
            System.out.println("Table created");
            sta.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // performance after already instantiated
        timeStart = System.currentTimeMillis();
        conn = instance.getConnection();
        timeEnd = System.currentTimeMillis();
        System.out.println("Time to get instance: " + (timeEnd - timeStart));
    }

}
