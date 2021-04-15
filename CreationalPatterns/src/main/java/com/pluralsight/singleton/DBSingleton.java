package com.pluralsight.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBSingleton {

    private static volatile DBSingleton instance = null;
    private static volatile Connection conn = null;

    private DBSingleton() {
        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if(conn != null) {
            throw new RuntimeException("Use getConnection() method to create");
        }

        if(instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }

    }

    public static DBSingleton getInstance() {
        if (instance == null) {
            synchronized(DBSingleton.class) {
                if (instance == null) {
                    instance = new DBSingleton();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        if (conn == null) {
            synchronized (DBSingleton.class) {
                if (conn == null) {
                    try {
                        String dbURL = "jdbc:derby:memory:codejava/webdb;create=true";
                        conn = DriverManager.getConnection(dbURL);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return conn;
    }

}
