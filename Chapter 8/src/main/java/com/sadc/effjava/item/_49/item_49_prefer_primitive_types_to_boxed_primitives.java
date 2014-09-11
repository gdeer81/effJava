package com.sadc.effjava.item._49;

import java.util.Comparator;


public class item_49_prefer_primitive_types_to_boxed_primitives {

    public static void main(String[] args) {
        System.out.println("What is autoboxing/auto-boxing?");
        System.out.println("Differences between primitives and boxed primitivies?");
        System.out.println("What happens here?");
        Comparator<Integer> naturalOrder = new Comparator<Integer>() {
            public int compare(Integer first, Integer second) {
                return first < second ? -1 : (first == second ? 0 : 1);
            }
        };
        Integer first = 0;
        Integer second = new Integer(0);
        System.out.println(first == second);
        System.out.println(first < second);
        System.out.println(first > second);
        System.out.println("ಠ_ಠ");
        System.out.println("Why is this so slow!");
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}
