package com.sadc.effjava.item._48;

import java.math.BigDecimal;

public class item_48_avoid_float_and_double_if_exact_required {

    public static void main(String[] args) {
        System.out.println("float and double are bad for calculating monetary values. Why?");
        System.out.println(1.03-.42);
        System.out.println(1.00-9*.10);
        System.out.println("Use BigDecimal, int or long instead!");
        BigDecimal TEN_CENTS = new BigDecimal(".01");
        BigDecimal funds = new BigDecimal("1.00");
        BigDecimal discount = new BigDecimal(9);
        System.out.println(funds.subtract(discount).multiply(TEN_CENTS));
        System.out.println("Can we be more efficient?");
        int itemsBought = 0;
        int funds1 = 100;
        for (int price = 10; funds1 >= price; price += 10) {
            itemsBought++;
            funds1 -= price;
        }
        System.out.println(itemsBought + " items bought.");
        System.out.println("Money left over: "+ funds1 + " cents");
        System.out.println("Check out Floating Point - Computerphile on youtube for more info and examples");
    }
}
