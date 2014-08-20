package ch3_methods_common_to_all_objects;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created by g592334
 * Date: 8/20/2014.
 */

public class item_11_override_clone_judiciously {

    public static void main(String[] args) {




        //The problem with the clone architecture is that its incompatible with normal use of final fields referring
        //to mutable objects, except in cases where the mutable objects may be safely shared between an object and
        //its clone. In order to make it cloneable, may be necessary to remove final modifiers from some fields.
    }

    public boolean cloneMethod() {
        int x = 1;

        //returns true
        x.clone() != x;

        //returns true
        x.clone().getClass() == x.getClass();

        //returns true
        x.clone().equals(x);


    }

    // this returns PhoneNumber, not Object and it is legal to do this.
    // It is now legal for an overriding method's return type to be a subclass of the overridden method's
    // return type.
    @Override public PhoneNumber clone() {
        try {
            return (PhoneNumber) super.clone();
        } catch(CloneNotSupportedException e) {
            throw new AssertionError();  // Can't happen
        }
    }

    public class Stack implements Cloneable {
        private Object[] elements;
        private int size = 0;
        private static final int DEFAULT_INITIAL_CAPACITY = 16;
        public Stack() {
            this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
        }
        public void push(Object e) {
            ensureCapacity();
            elements[size++] = e;
        }
        public Object pop() {
            if (size == 0)
                throw new EmptyStackException();
            Object result = elements[--size];
            elements[size] = null; // Eliminate obsolete reference
            return result;
        }
        // Ensure space for at least one more element.
        private void ensureCapacity() {
            if (elements.length == size)
                elements = Arrays.copyOf(elements, 2 * size + 1);
        }

        @Override public Stack clone() {
            try {
                Stack result = (Stack) super.clone();
                result.elements = elements.clone();
                return result;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }
}
