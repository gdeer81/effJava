package ch8_general_programming;

import java.util.*;

public class item_52_refer_to_objects_by_interface {

    // We have a method that consumes a Collection and prints it
    static void consumeCollectionAndPrint(Collection<String> list) {
        for(String s : list) {
            System.out.println("...processing : " + s);
        }
    }
    // We have an inferior method that consumes an ArrayList and prints it
    // Note that this method takes an ArrayList, but doesn't need any implementation specific to an ArrayList
    // This method could easily accept any type of Collection to do the same operation
    static void consumeCollectionBadlyAndPrint(ArrayList<String> list) {
        for(String s : list) {
            System.out.println("...processing : " + s);
        }
    }

    public static void main(String[] args) {
        //Lets build a few different types of collections
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Foo");
        arrayList.add("Bar");
        arrayList.add("Baz");
        arrayList.add("Qux");
        arrayList.add(1, "Foo");

        Stack<String> stack = new Stack<String>();
        stack.push("Foo");
        stack.push("Bar");
        stack.push("Baz");
        stack.push("Qux");
        stack.push("Foo");

        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Foo");
        hashSet.add("Bar");
        hashSet.add("Baz");
        hashSet.add("Qux");
        hashSet.add("Foo");

        // If we try using our inferior method on each collection, we would have to cast each collection to an ArrayList
        System.out.println("***Processing ArrayList with consumeCollectionBadly");
        consumeCollectionBadlyAndPrint(arrayList);

        // Using our superior method, we can be flexible in how we build collections to give to the method
        System.out.println("***Processing ArrayList with consumeCollection");
        consumeCollectionAndPrint(arrayList);
        System.out.println("***Processing Stack with consumeCollectionBadly");
        consumeCollectionAndPrint(stack);
        System.out.println("***Processing HashSet with consumeCollectionBadly");
        consumeCollectionAndPrint(hashSet);
    }
}