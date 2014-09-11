import java.util.HashMap;
import java.util.Map;

/**
 * Created by p590032 on 9/4/2014.
 */
public class item_29_consider_typesafe_heterogeneous_containers {


    /**
     * In most uses the cntainer is parameterized. This limits
     * you to a fixed number of type parameters per container.
     */
    /**
     * What if we need more flexibility like with a database?
     * Luckily, there is an easy way to achieve this effect. The
     * idea is to parameterize the key instead of the container.
     */

    public static void main(String[] args) {
        Favorites f = new Favorites();
        f.putFavorite(String.class, "Java");
        f.putFavorite(Integer.class, 0xcafebabe);
        f.putFavorite(Class.class, Favorites.class);
        String favoriteString = f.getFavorite(String.class);
        int favoriteInteger = f.getFavorite(Integer.class);
        Class<?> favoriteClass = f.getFavorite(Class.class);
        System.out.printf("%s %x %s%n", favoriteString, favoriteInteger, favoriteClass.getName());
    }

    public static class Favorites {
        private Map<Class<?>, Object> favorites =
  //The thing to notice is that the wildcardtype is nested:
  // it’s not the type of the Map that’s a wildcard type but the type of its key.
        new HashMap<Class<?>, Object>();

        // Achieving runtime type safety with a dynamic cast
        public <T> void putFavorite(Class<T> type, T instance) {
            favorites.put(type, type.cast(instance));
        }
        public <T> T getFavorite(Class<T> type) {
            //dynamically cast
            return type.cast(favorites.get(type));
        }
    }
}
