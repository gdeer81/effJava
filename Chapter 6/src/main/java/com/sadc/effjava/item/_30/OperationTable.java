package main.java.com.sadc.effjava.item._30;

import com.apple.jobjc.foundation.NSArray;

/**
 * Created with IntelliJ IDEA.
 * User: p511628
 * Date: 9/23/14
 * Time: 9:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class OperationTable {
    public static void main(String[] args) {
        double x = Double.parseDouble("12");
        double y = Double.parseDouble("6");

        for (Operation op : Operation.values()) {
            System.out.printf("%f %s %f = %f%n",x, op, y, op.apply(x, y));
        }

        System.out.printf("%n%f %s %f = %f%n",x, Operation.PLUS.toString(), y, Operation.PLUS.apply(x,y));
        //System.out.printf("%n%f %s %f = %f%n",x, Operation.ROOT.toString(), y, Operation.ROOT.apply(x,y));

        String[] operators = {"+","-","*","/","^"};
        for (String operator : operators) {
            System.out.println(new Operate(12,6,operator));
        }

    }
}
