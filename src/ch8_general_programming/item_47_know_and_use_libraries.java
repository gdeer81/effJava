import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: p590032
 * Date: 8/5/14
 * Time: 10:34 AM
 * To change this template use File | Settings | File Templates.
 */
public class item_47_know_and_use_libraries {

    private static final Random rnd = new Random();

    public static void main(String[] args) {
        System.out.println("By using a standard library,\n" +
                "you take advantage of the knowledge of the experts who wrote it and the\n" +
                "experience of those who used it before you.");

        System.out.println(random(5) + "vs" + betterRandom(5));

    }
    // Common but deeply flawed!
    static int random(int n) {
        return Math.abs(rnd.nextInt()) % n;
    }
    public static int betterRandom(int n){
        return new Random().nextInt(5);
    }
    
}


