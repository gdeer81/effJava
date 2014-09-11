import java.util.HashSet;
import java.util.Set;

/**
 * Created by p590032 on 9/4/2014.
 */
public class item_27_favor_generic_methods {
    // Uses raw types - unacceptable! (Item 23)
    public static Set badUnion(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    // Generic method
    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<E>(s1);
        result.addAll(s2);
        return result;
    }

    public static void main(String[] args) {
        //0_0
        item_27_favor_generic_methods.badUnion(new HashSet<String>(), new HashSet<Integer>());
//        item_27_favor_generic_methods.union(new HashSet<String>(), new HashSet<Integer>());
        //A related pattern is the generic singleton factory
        /**
         * // Generic singleton factory pattern
         * private static UnaryFunction<Object> IDENTITY_FUNCTION =
         * new UnaryFunction<Object>() {
         * public Object apply(Object arg) { return arg; }
         * };
         */
        /**
         * public static <T> UnaryFunction<T> identityFunction() {
         * return (UnaryFunction<T>) IDENTITY_FUNCTION;
         * }
         */
    }
}
