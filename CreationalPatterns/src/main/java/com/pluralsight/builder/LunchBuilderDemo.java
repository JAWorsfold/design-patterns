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
        LunchBuilder lunchBuilder = new LunchBuilder("Wheat", "Lettuce", "Mustard", "Ham");

        System.out.println(lunchBuilder.getBread());
        System.out.println(lunchBuilder.getCondiments());
        System.out.println(lunchBuilder.getDressing());
        System.out.println(lunchBuilder.getMeat());

    }

}
