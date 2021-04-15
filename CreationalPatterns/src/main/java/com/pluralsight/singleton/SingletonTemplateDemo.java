package com.pluralsight.singleton;

public class SingletonTemplateDemo {

    public static void main(String[] args) {
        // Won't allow access to the constructor
        // SingletonTemplate testConstructor = new SingletonTemplate();

        SingletonTemplate instance = SingletonTemplate.getInstance();
        SingletonTemplate anotherInstance = SingletonTemplate.getInstance();

        System.out.println(instance);
        System.out.println(anotherInstance);
    }

}
