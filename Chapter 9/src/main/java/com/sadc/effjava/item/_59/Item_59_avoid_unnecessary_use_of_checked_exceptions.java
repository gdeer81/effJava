
//Chapter 9 - item 59: Avoid unnecessary use of checked exceptions
//Author: Edgar Garcia

public class Item_59_Avoid_unnecessary_use_of_checked_exceptions {

    public static void main(String[] args) {

        //Checked exceptions are great because they force programmers to handle exceptional conditions. However,
        // overuse of them can make an API far less pleasant to use because it forces the programmer to handle
        // exceptions in multiple catch blocks which takes time to implement and might be more work than anticipated.
        //This burden is justified, however, if the exceptional condition cannot be prevented by the API itself AND
        // the user can handle the exception.

        //If the user of the API cannot do better, an unchecked exception is more appropriate.

        //An additional burden caused by a checked exception is substrantially higher if it is the sole checked
        // exception. This means, if there are others, the method must already appear in another try block and this
        // exception meerely requires another catch block. It may be worth to ask yourself if there is a way to avoid
        // the checked exception.

        //One way to turn a checked exception into an unchecked one is to break up the method into two (or more
        // methods) methods, the first of which returns a boolean that indicates whether the exception would be thrown.

        // Invocation with checked exception
        try {
            obj.action(args);
        } catch(TheCheckedException e) {
        // Handle exceptional condition
            ...
        }

        //change it to this:
        // Invocation with state-testing method and unchecked exception
        if (obj.actionPermitted(args)) {
            obj.action(args);
        } else {
        // Handle exceptional condition
            ...
        }

        //The first block of code is more readable, but the second one is more flexible because it extracts the
        // permission check
        //If an object is to be accessed concurrently without external synchronization then this refactoring may be
        // inapproriate since the state can change between invocation of the two methods.

        //LONG STORY SHORT: Dont try to over-catch exceptions as it may make it more difficult to use/extend your API
        // in the future because of how many hoops a user has to jump through to use the API.
        // Also, consider breaking up your method into multiple parts to turn checked exceptions into unchecked ones.

    }

}