package ch5_generics.item26.initial_attempt;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created by k557782 on 9/4/14.
 */
// Initial attempt to generify Stack - won't compile!
public class Stack<E> {

    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private E[] elements;
    private int size = 0;

    public Stack() {
        //elements = new E[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        E result = elements[--size];
        elements[size] = null; // Eliminate obsolete reference
        return result;
    }
    // no changes in isEmpty or ensureCapacity

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
