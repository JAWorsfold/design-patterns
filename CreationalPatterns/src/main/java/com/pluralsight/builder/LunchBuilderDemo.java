package com.pluralsight.builder;

public class LunchBuilderDemo {

    public static void main(String[] args) {

        // using setters, not immutable, has issues
//        LunchBuilder lunchBuilder = new LunchBuilder();
//        lunchBuilder.setBread("Wheat");
//        lunchBuilder.setCondiments("Lettuce");
//        lunchBuilder.setDressing("Mustard");
//        lunchBuilder.setMeat("Ham");

        // using telescoping constructors
//        LunchBuilderTele lunchBuilder = new LunchBuilderTele("Wheat", "Lettuce", "Mustard", "Ham");

        // using a Builder pattern
        LunchBuilder.Builder builder = new LunchBuilder.Builder();
        builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");
        LunchBuilder lunchBuilder = builder.build();

        System.out.println(lunchBuilder.getBread());
        System.out.println(lunchBuilder.getCondiments());
        System.out.println(lunchBuilder.getDressing());
        System.out.println(lunchBuilder.getMeat());

    }

}
