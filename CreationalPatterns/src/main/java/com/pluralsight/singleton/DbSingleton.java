package com.pluralsight.singleton;

public class DbSingleton {

    private static volatile DbSingleton instance = null;

    private DbSingleton() {
        // stopping use of reflection
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    // don't make entire method synchronized
    public static DbSingleton getInstance() {

        if (instance == null) {
            // would use other object in real application for lock
            synchronized(DbSingleton.class) {
                // check again in case of another thread instantiating it
                // while a current thread is waiting for lock
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }

}
