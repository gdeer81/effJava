package com.sadc.effjava.item._2.builder_pattern;

/**
 * Created by dkocian on 8/14/2014.
 */
public class Main {
    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();
    }
}
