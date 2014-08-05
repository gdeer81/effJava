/**
 * Created by IntelliJ IDEA.
 * User: p590032
 * Date: 8/5/14
 * Time: 1:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class item_50_avoid_strings_where_other_types_are_better {
    public static void main(String[] args) {
        System.out.println("Strings are poor substitutes for other value types");
        // Inappropriate use of string as aggregate type
//        String compoundKey = className + "#" + i.next();
    }

    // Broken - inappropriate use of string as capability!
    public class ThreadLocal {
        private ThreadLocal() {
            System.out.println("what if 2 clients use the same key?");
        }
        // Sets the current thread's value for the named variable.
//        public void set(String key, Object value);
        // Returns the current thread's value for the named variable.
//        public Object get(String key);
        //whats the better way?

    }
}
