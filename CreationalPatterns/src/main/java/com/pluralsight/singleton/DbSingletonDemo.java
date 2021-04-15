package com.pluralsight.singleton;

public class DbSingletonDemo {

    public static void main(String[] args) {
        // Won't allow access to the constructor
        // DbSingleton testConstructor = new DbSingleton();

        DbSingleton instance = DbSingleton.getInstance();
        DbSingleton anotherInstance = DbSingleton.getInstance();

        System.out.println(instance);
        System.out.println(anotherInstance);
    }

}
