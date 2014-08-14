package ch2_creating_and_destroying_objects;

/**
 * Created by k557782 on 8/11/2014.
 */
public class Item_01_Consider_Static_Factory_Methods_Instead_Of_Constructors {
    // If the parameters to a constructor do not, in and of themselves, describe the object being returned,
    // a static factory with a well-chosen name is easier to use and the resulting client code easier to read.
    // In cases where a class seems to require multiple constructors with the same signature, replace the constructors
    // with static factory methods and carefully chosen names to highlight their differences.
    // A third advantage of static factory methods is that, unlike constructors, they can return an object of any
    // subtype of their return type.

    // The main disadvantage of providing only static factory methods is that classes without public or protected
    // constructors cannot be subclassed.
    // A second disadvantage of static factory methods is that they are not readily distinguishable from other
    // static methods.

    /*
        valueOf— Returns an instance that has, loosely speaking, the same value as its parameters.
        Such static factories are effectively type-conversion methods.

        of— A concise alternative to valueOf, popularized by EnumSet (Item 32).

        getInstance— Returns an instance that is described by the parameters but cannot be said to have the same value.
        In the case of a singleton, getInstance takes no parameters and returns the sole instance.

        newInstance— Like getInstance, except that newInstance guarantees that each instance returned is
        distinct from all others.

        getType— Like getInstance, but used when the factory method is in a different class.
        Type indicates the type of object returned by the factory method.

        newType— Like newInstance, but used when the factory method is in a different class.
        Type indicates the type of object returned by the factory method.
     */
}
