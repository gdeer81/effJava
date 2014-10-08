
//Chapter 9 - Item_60_favor_the_use_of_standard_exceptions
//Author: Edgar Garcia

public class Item_60_favor_the_use_of_standard_exceptions {

    public static void main(String[] args) {

        //The most distinguishing attribute of an expert programmer vs an inexperienced one is the high degree of
        // reused code. This holds true for exceptions as well. Reusing preexisting exceptions makes your API easier to
        // learn because it follows conventions that have been established already. Also, is that programs are easier
        // to read because they arent cluttered with unfamiliar exceptions. Lastly, less exception classes mean smaller
        // memory impact and less time loading classes.

        //Most commonly used exceptions: IllegalArgumentException and IllegalStateException. Most other exceptions
        // branch off of this in some conceptual way. For example, NullPointerException is thrown when a null is passed
        // in as a parameter instead of an IllegalArgumentException. Similarly, an IndexOutOfBoundsException would be
        // called if there was a parameter out of range instead of an IllegalArgumentException.


        //Be aware that choosing which exception to reuse is not always an exact science. Supposed there were a method
        // to deal a hand from the deck that took the size of the hand as an argument. If the caller passes an argument
        // that is greater than the number of cards in the deck, this could be construed as an illegalArgumentException
        // because the handSize parameter is too high, or an IllegalStateException because the deck object contains too
        // few cards for the request. In this case there is not an exact right or wrong way to handle it, however,
        // there is better or worse.

        //LONG STORY SHORT: Try to use the standard exceptions whenever possible and some exceptions can be used in
        // place of other exceptions depending on your preference of what the exception should be.
    }

}