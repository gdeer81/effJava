
//Chapter 9 - Item 57
//Author: Edgar Garcia

public class Item_57_use_exceptions_only_for_exceptional_conditions {

    public static void main(String[] args) {

        // Horrible abuse of exceptions. Don't ever do this!
        // Using exceptions to terminate loops is BAD!!
        try {
            int i=0;
            while(true)
                range[i++].climb();
        } catch(ArrayIndexOutOfBoundsException e) {
        }

        //Normal way of traversing through a collection
        //1. Much faster than terminating a loop with exception because exceptions are not made to be a standard way to
        // terminate loops
        //2. Placing code inside a try-catch block inhibits certain optimizations
        //3. Looping through an array doesnt necessarily result in redundant checks. JVM optimizes it
        for (Mountain m : range)
            m.climb();

        //In presence of unrelated bug, the loop can fail silently and mask the bug making it much more difficult to
        //debug the issue
        //Also, if a loop idiom were used, the bug could generate an uncaught exception resulting in immdediate thread
        //termination and /or misinterpreted as normal loop termination


        //LONG STORY SHORT: Exceptions are to be used only for exceptional conditions; they should never be used for
        // ordinary control flow. Dont write APIs that force others to do so either.

    }



}

