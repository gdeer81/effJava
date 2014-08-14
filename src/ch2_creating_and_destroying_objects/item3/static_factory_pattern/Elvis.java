package ch2_creating_and_destroying_objects.item3.static_factory_pattern;

/**
 * Created by dkocian on 8/14/2014.
 * Singleton with static factory
 * One advantage of the factory-method approach is that it gives you the flexibility to change your mind about whether
 * the class should be a singleton without changing its API.
 */
public class Elvis {
    private static final Elvis INSTANCE = new Elvis();

    private Elvis() {
    }

    public static Elvis getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {
    }
}
