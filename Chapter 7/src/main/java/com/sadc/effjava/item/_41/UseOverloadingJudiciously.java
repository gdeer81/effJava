package com.sadc.effjava.item._41;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Atlas on 10/1/2014.
 */
public class UseOverloadingJudiciously {

    //the class is overloading and which method to use is made by the time the program has run.
    /**
     * selection among
     * overloaded methods is static, while selection among overridden methods is
     * dynamic.
     * When is a method overriden?  when a subclass contains a method declaration
     with the same signature as a method declaration in an ancestor
     */

    //so lets fix our collection classifier

    //how can we make overloading less confusing? A safe, conservative policy is never to export two overloadings with
    //the same number of parameters.
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();
        List<Integer> list = new ArrayList<Integer>();

        for (int i = -3; i < 3; i++) {
            set.add(i);
            list.add(i);
        }
        for (int i = 0; i < 3; i++) {
            set.remove(i);
            list.remove(i);
        }
        //what will be the results?
        System.out.println(set + " " + list);
    }

}

// Broken! - What does this program print?
 class CollectionClassifier {
    public static String classify(Set<?> s) {
        return "Set";
    }
    public static String classify(List<?> lst) {
        return "List";
    }
    public static String classify(Collection<?> c) {
        return "Unknown Collection";
    }
    public static void main(String[] args) {
        Collection<?>[] collections = {
                new HashSet<String>(),
                new ArrayList<BigInteger>(),
                new HashMap<String, String>().values()
        };
        for (Collection<?> c : collections)
            System.out.println(classify(c));
    }
}
