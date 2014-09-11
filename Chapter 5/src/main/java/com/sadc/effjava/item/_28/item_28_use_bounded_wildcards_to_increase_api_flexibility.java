package com.sadc.effjava.item._28;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by p590032 on 9/4/2014.
 */
public class item_28_use_bounded_wildcards_to_increase_api_flexibility {

    // pushAll method without wildcard type - deficient!
    public <E> void pushAll(Iterable<E> src) {
        for (E e : src) {
            //push(e);

        }
    }

    Stack<Number> numberStack = new Stack<Number>();
    Iterable<Integer> integers = new ArrayList<Integer>();
    //numberStack.pushAll(integers);

    // Wildcard type for parameter that serves as an E producer
//    public <E> void pushAll(Iterable<? extends E> src) {
//        for (E e : src){
//
//            //push(e);
//        }
//    }

//    For maximum flexibility, use wildcard types on input
//    parameters that represent producers or consumers.
//PECS stands for producer-extends, consumer-super.
// Do not use wildcard types as return types.
    Set<Integer> sIntegers = new HashSet<Integer>();
    Set<Double> doubles = new HashSet<Double>() ;
//    Set<Number> numbers = Union.<Number>union(sIntegers, doubles);
}
