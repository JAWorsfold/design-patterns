package com.pluralsight.builder;

import lombok.Data;
import lombok.Getter;

// @Data for including setters
@Getter // now immutable
public class LunchBuilder {

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchBuilder() {}

    // example telescoping constructors
    public LunchBuilder(String bread) {
        this.bread = bread;
    }
    public LunchBuilder(String bread, String condiments) {
        this(bread);
        this.condiments = condiments;
    }
    public LunchBuilder(String bread, String condiments, String dressing) {
        this(bread, condiments);
        this.dressing = dressing;
    }
    public LunchBuilder(String bread, String condiments, String dressing, String meat) {
        this(bread, condiments, dressing);
        this.meat = meat;
    }

}
