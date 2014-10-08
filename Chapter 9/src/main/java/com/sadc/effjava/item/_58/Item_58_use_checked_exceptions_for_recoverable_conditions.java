
//Chapter 9 - Item 58: Use checked exceptions for recoverable conditions and runtime exceptions for programming errors
//Author: Edgar Garcia

public class Item_58_use_checked_exceptions_for_recoverable_conditions {

    public static void main(String[] args) {

        //Java provides three(3) kinds of throwables: CHECKED exceptions, RUNTIME exceptions, and ERRORS;
        //Cardinal Rule in your decision to use a checked or unchecked exception:
        //  use checked exceptions for conditions from which the caller can reasonably be expected to recover
        //By throwing a checked exception you let the caller handle in a catch clause.
        //Each exception a method is declared to throw is an indication to the user that this is a possible outcome.
        //This allows the user to handle it properly because it is expected


        //The two unchecked exceptions should general be uncaught. It might do more harm than good to catch it.
        //USE runtime exceptions to indicate programming errors within your code and to show were better practices
        // can be used.
        //Example: The contract for array access specifies that the array index must be between zero and the array
        // length minus one. ArrayIndexOutOfBoundsException indications that this precondition was violated.
        //It is best not to implement any new Error subclasses. All of the unchecked throwables you implement should
        // subclass RunetimeException
        //It is recommended to never do this though, because it does not have any real benefits over ordinary
        // exceptions and would also confuse a user of your API


        //LONG STORY SHORT: Use checked exceptions for recoverable conditions and runtime exceptions for programming
        // errors. Its not always black and white, but if you beleive a condition is likely to allow for recovery, use
        // a cheked exception; if not, use a runtime exception. If it isn't clear whether recovery is possible, youre
        // probably better off using an unchecked exception.
    }
}