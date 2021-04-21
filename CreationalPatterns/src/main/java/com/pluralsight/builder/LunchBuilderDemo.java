package com.pluralsight.builder;

public class LunchBuilderDemo {

    public static void main(String[] args) {

        LunchBuilder lunchBuilder = new LunchBuilder();

        // using setters, not immutable, has issues
        lunchBuilder.setBread("Wheat");
        lunchBuilder.setCondiments("Lettuce");
        lunchBuilder.setDressing("Mustard");
        lunchBuilder.setMeat("Ham");

        System.out.println(lunchBuilder.getBread());
        System.out.println(lunchBuilder.getCondiments());
        System.out.println(lunchBuilder.getDressing());
        System.out.println(lunchBuilder.getMeat());

    }

}
