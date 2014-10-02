package src.main.java.com.sadc.effjava.item._38;

import java.math.BigInteger;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] _args) {
        // Check parameters for validity
        //basically, your methods should fail as fast as possible when given bad parameters
        // it is bad to return something that could cause an error somewhere else in the app

        Item item_withNullItemCode = new Item(null);

        /*
        processItem_bad(item_withNullItemCode);
        //*/
        /*
        processItem_good(item_withNullItemCode);
        //*/

        /*
        for(int i=0; i<4; i++)
            System.out.println( getString(i) );
        //*/

        /*
        System.out.println( getString_good(-1) );
        //*/

        //There are exceptions to when you should validate parameters,
        // and that is if the validation would be too expensive to be practical
        // AND if the validation is done as part of the computation
    }

    static class Item {
        public BigInteger itemCode;
        public Item(BigInteger i) {
            itemCode = i;
        }
    }

    // The fact that this method can throw an unchecked exception should be documented, maybe in a javadoc
    public static void processItem_good(Item item) {
        // do some work with a given item
        // the given item should have an itemcode, else it's invalid
        if(item.itemCode == null)
            throw new InvalidParameterException("processItem() given item that has no itemCode");
        System.out.println("Work done with Item:" + item.itemCode
                + " compareTo(100):" + item.itemCode.compareTo(new BigInteger("100")));
    }
    public static void processItem_bad(Item item) {
        // do some work with a given item
        System.out.println("Work done with Item:" + item.itemCode
                + " compareTo(100):" + item.itemCode.compareTo(new BigInteger("100"))); //possible NPE
    }

    private static String[] stringz = {"hi", "bye", "ciao"};
    // This is a public method so it should
    public static String getString(int index) {
        if(index < 0)
            throw new IndexOutOfBoundsException("index can't be negative");
        if(index >= stringz.length)
            throw new IndexOutOfBoundsException("index is too big");
        return stringz[index];
    }
}