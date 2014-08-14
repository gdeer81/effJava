package ch2_creating_and_destroying_objects.item3;

/**
 * Created by dkocian on 8/14/2014.
 * Singleton with public final field
 */
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {
    }

    public void leaveTheBuilding() {
    }
}
