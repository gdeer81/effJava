package main.java.com.sadc.effjava.item._30;

/**
 * Created with IntelliJ IDEA.
 * User: p511628
 * Date: 9/23/14
 * Time: 9:49 PM
 * To change this template use File | Settings | File Templates.
 */
public enum Operation {
    PLUS("+") {
        double apply(double x, double y) { return x + y; }
    },
    MINUS("-") {
        double apply(double x, double y) { return x - y; }
    },
    TIMES("*") {
        double apply(double x, double y) { return x * y; }
    },
    DIVIDE("/") {
        double apply(double x, double y) { return x / y; }
    };
    private final String symbol;
    Operation(String symbol) { this.symbol = symbol; }
    @Override public String toString() { return symbol; }

    abstract double apply(double x, double y);
}
