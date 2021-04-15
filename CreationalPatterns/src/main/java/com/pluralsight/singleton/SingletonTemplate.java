package com.pluralsight.singleton;

public class SingletonTemplate {

    private static volatile SingletonTemplate instance = null;

    private SingletonTemplate() {
        // stopping use of reflection
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    // don't make entire method synchronized
    public static SingletonTemplate getInstance() {

        if (instance == null) {
            // would use other object in real application for lock
            synchronized(SingletonTemplate.class) {
                // check again in case of another thread instantiating it
                // while a current thread is waiting for lock
                if (instance == null) {
                    instance = new SingletonTemplate();
                }
            }
        }
        return instance;
    }

}
