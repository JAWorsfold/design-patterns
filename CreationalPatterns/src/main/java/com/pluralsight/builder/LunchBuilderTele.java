package com.pluralsight.builder;

import lombok.Getter;

@Getter
public class LunchBuilderTele {

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchBuilderTele() {}

    // example telescoping constructors
    public LunchBuilderTele(String bread) {
        this.bread = bread;
    }
    public LunchBuilderTele(String bread, String condiments) {
        this(bread);
        this.condiments = condiments;
    }
    public LunchBuilderTele(String bread, String condiments, String dressing) {
        this(bread, condiments);
        this.dressing = dressing;
    }
    public LunchBuilderTele(String bread, String condiments, String dressing, String meat) {
        this(bread, condiments, dressing);
        this.meat = meat;
    }

}
