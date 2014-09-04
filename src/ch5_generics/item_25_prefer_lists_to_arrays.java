package ch5_generics;

/**
 * Created by k557782 on 9/4/14.
 */
public class item_25_prefer_lists_to_arrays {
    // 1)Arrays are covariant
    // Fails at runtime!
    //Object[] objectArray = new Long[1];
    //objectArray[0] = "I don't fit in"; // Throws ArrayStoreException
//
//    List<Object> ol = new ArrayList<Long>();
//    ol.add("I don't fit in")
//
    // with an array you find out that you’ve made a mistake at runtime; with a list, you find out at compile time.
    // 2) Arrays are reified, arrays know and enforce their element types at runtime.
    // For example, it is illegal to create an array of a generic type, a parameterized type, or a type parameter.
    // Can't create generic arrays, it isn't typesafe
    //Types such as E, List<E>, and List<String> are technically known as non-reifiable types .
    // Intuitively speaking, a non-reifiable type is one whose runtime representation contains less information than
    // its compile-time representation.
}
