package main.java.com.sadc.effjava.item._30;

/**
 * Created with IntelliJ IDEA.
 * User: p511628
 * Date: 9/23/14
 * Time: 9:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class Operate {

    private double x;
    private double y;
    private String symbol;

    public Operate (double x, double y, String symbol) {
        this.x = x;
        this.y = y;
        this.symbol = symbol;
    }

    public double plus(double x, double y) {
        return x + y;
    }

    public double minus(double x, double y) {
        return x - y;
    }


    public double times(double x, double y) {
        return x * y;
    }


    public double divide(double x, double y) {
        return x / y;
    }

    private double determineOperation() throws Exception {
        switch (this.symbol) {
            case "+":
                return plus(this.x, this.y);
            case "-":
                return minus(this.x, this.y);
            case "*":
                return times(this.x, this.y);
            case "/":
                return divide(this.x, this.y);
            default:
                throw new Exception("Operation not defined.");
        }
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public String getSymbol() {
        return this.symbol;
    }

    @Override
    public String toString() {
        try {
            return this.getX()+" "+this.getSymbol()+" "+this.getY()+" = "+this.determineOperation();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
