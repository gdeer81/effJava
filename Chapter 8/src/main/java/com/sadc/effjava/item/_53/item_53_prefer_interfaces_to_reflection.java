package com.sadc.effjava.item._53;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.NoSuchElementException;

public class item_53_prefer_interfaces_to_reflection {
    public static void main(String[] args) {
        System.out.println("I have no idea why anyone would need to use Reflection " +
                           "unless it's to utilize legacy code, or to implement the weird stuff Spring does for IOC");
        System.out.println("Reflection lets you access constructors, methods and fields of a loaded class.\n" +
                           "You can write a class that reflectively uses another class,\n" +
                           "even if the class being used did not exist when the first class was compiled.");
        System.out.println("You can mitigate the disadvantages of reflection by accessing a reflective instance\n" +
                           "using an interface implemented by the reflected instance.");
    }
}