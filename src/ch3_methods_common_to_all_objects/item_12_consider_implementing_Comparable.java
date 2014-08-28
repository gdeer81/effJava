package ch3_methods_common_to_all_objects;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by g592334
 * Date: 8/20/2014
 */

public class item_12_consider_implementing_Comparable {

    public static void main(String[] args) {

        //The compareTo method is not declared in Object and is it sole method in the Comparable interface. It is
        // similar to Object's equals method except that it permits order comparisons in addition to equality and it
        // is generic.
        //Sorting an array that implements Comparable is as easy as calling Arrays.sort(a);

        //You gain a tremendous amount of power for a small amount of effort. Virtually all of the value classes in
        // Java implement Comparable. If you are writing a class with natural order then you should strongly consider
        // implementing Comparable.

        //Similar to equals in that it returns -1, 0 or 1 if its <, == or > respectively than the specified object.
        //Similar to hashCode, compareTo can break classes if the contract is violated. The main classes that
        // depend on comparison include Collection type of classes, Arrays and TreeSet/Maps.

        //Provisions of the compareTo contract:
        //1: If you reverse the direction of comparison between two object references, the expected thing happens:
        // if x is < y then y must be > x. if x == y then y == x. if x > y then y < x.
        //2: if x > y and y > z then x > z
        //3: All objects that compare as equal must yield same results when compared to any other object.

        //Like the equals contract, compareTo must impose reflexivity, symmetry and transitivity as mentioned above.
        // There is no way to extend the class with a new value component while preserving the compareTo contract
        // unless you are willing to abstract it. Same workaround applies too. If you want to add a value component to
        // a class that implements Comparable, don't extend it; write an unrelated class containing an instance of the
        // first class. Then provide a "view" method that returns this instance. This frees you to  implement whatever
        // compareTo method you like on the second class, while allowing its client to view an instance of the second
        // class as an instance of the first class when needed.

        //The final provision of compareTo is that the compareTo method should generally return the same results as the
        // equals method. However, If this contract is violated, ordering will be inconsistent with equals and it will
        // still work but will return unexpected results.

        //The compareTo method is similar to the equals method except for a few key differences. Comparable interface
        // is parameterized so the compareTo method is typed so you don't need to check or cast the argument. If the
        // argument is of the wrong type, the invocation wont even compile.

        //Compare object reference fields by invoking the compareTo method recursively. If a field does not implement
        // Comparable or you need to use a nonstandard ordering, you can use an explicit Comparator instead. Either
        // write your own, or use a preexisting one as in this compareTo method.
        //SEE CaseInsensitiveString class below.

        //If a class has multiple significant fields, you want to start with the most significant field and work your
        // way down. If any comparison results in anything other than zero, you are done and just return.
        //SEE compareTo method below for PhoneNumber

    }

    //This program that relies on the fact that String implements Comparable, prints an alphabetized list of its
    // command-line arguments with duplicates eliminated
    public class WordList {
        //This should be static but not allowed in inner class
        public void main(String[] args) {
            Set<String> s = new TreeSet<String>();
            Collections.addAll(s, args);
            System.out.println(s);
        }
    }

    public final class CaseInsensitiveString
            implements Comparable<CaseInsensitiveString>{
        String s;

        //Note that it implements Comparable<CaseInsensitiveString>. This means that it an only be compared to other
        // CaseInsensitiveString references. Note also that the parameter is a CaseInsensitiveString, not an Object.
        public int compareTo(CaseInsensitiveString cis) {
            return String.CASE_INSENSITIVE_ORDER.compare(s, cis.s);
        }
        // Remainder omitted
    }

    //NORMAL (BUT BAD) WAY
//    public int compareTo(PhoneNumber pn) {
//        // Compare area codes
//        if (areaCode < pn.areaCode)
//            return -1;
//        if (areaCode > pn.areaCode)
//            return  1;
//        // Area codes are equal, compare prefixes
//        if (prefix < pn.prefix)
//            return -1;
//        if (prefix > pn.prefix)
//            return  1;
//        // Area codes and prefixes are equal, compare line numbers
//        if (lineNumber < pn.lineNumber)
//            return -1;
//        if (lineNumber > pn.lineNumber)
//            return  1;
//        return 0; // All fields are equal
//    }
    //While this method works, it can be improved because it doesn't specify the magnitude of the return value, only the sign.
//
//    public int compareTo(PhoneNumber pn) {
//        // Compare area codes
//        int areaCodeDiff = areaCode - pn.areaCode;
//        if (areaCodeDiff != 0)
//            return areaCodeDiff;
//        // Area codes are equal, compare prefixes
//        int prefixDiff = prefix - pn.prefix;
//        if (prefixDiff != 0)
//            return prefixDiff;
//        // Area codes and prefixes are equal, compare line numbers
//        return lineNumber - pn.lineNumber;
//    }

    //This works but should be used with extreme caution. Only use this if you are certain that the difference between
    // the two are <= Integer.MAX_VALUE(2^31 - 1) because if the DIFFERENCE is bigger than that then it can overflow
    // and give you an incorrect result such as a negative value. This can be hard to debug because it wont error out
    // and will work for most input values.
}
