package ch5_generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by k557782 on 9/4/14.
 */
public class item_23_dont_use_raw_types_in_new_code {
    // Ability to use raw types is left over for backwards compatibility
    // Always use parameterized types to insure correct insertion of objects
    // As a consequence, you lose type safety if you use a raw type like List, but not if you use a parameterized
    // type like List<Object>.

    //Example 1
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        unsafeAdd(strings, new Integer(42));
        String s = strings.get(0); // Compiler-generated cast
        // Line above will give you a class cast exception
    }

    private static void unsafeAdd(List list, Object o) {
        list.add(o); // This will give u a java compiler warning uses unchedked or unsafe operation
    }

    //Example 2
    // Unbounded wildcard type - typesafe and flexible
    static int numElementsInCommon(Set<?> s1, Set<?> s2) {
        int result = 0;
        for (Object o1 : s1) {
            if (s2.contains(o1)) {
                result++;
            }
        }
        return result;
    }
}
