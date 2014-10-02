package main.java.com.sadc.effjava.item._30;

/**
 * Created with IntelliJ IDEA.
 * User: p511628
 * Date: 9/23/14
 * Time: 9:19 PM
 * To change this template use File | Settings | File Templates.
 */

public class WeightTable {
    public static void main(String[] args) {
        double earthWeight = Double.parseDouble("150");
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values())
            System.out.printf("Weight on %s is %f%n",
                    p, p.surfaceWeight(mass));
    }
}
