package ch2_creating_and_destroying_objects.item2.java_beans_pattern;

/**
 * Created by dkocian on 8/14/2014.
 */
public class Main {
    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts();
        cocaCola.setServingSize(240);
        cocaCola.setServings(8);
        cocaCola.setCalories(100);
        cocaCola.setSodium(35);
        cocaCola.setCarbohydrate(27);
    }
}
