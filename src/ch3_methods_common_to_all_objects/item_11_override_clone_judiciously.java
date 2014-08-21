package ch3_methods_common_to_all_objects;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created by g592334
 * Date: 8/20/2014
 */

public class item_11_override_clone_judiciously {

    public static void main(String[] args) {

        //Cloneable determines the behavior of Object's protected clone method which returns a field-by-field copy
        //of the object, otherwise throw CloneNotSupportedException. Also, it does not have a 'clone' method of its own.

        //The class and superclasses must obey a fairly complex, unenforceable, and thinly documented protocol.
        //--SEE cloneMethod below--

        //In practice, programmers assume that if they extend a class and invoke super.clone from the subclass, the
        //returned object will be an instance of the subclass. The ONLY way superclass can provide this functionality
        //is to return an object obtained by calling super.clone. If a clone method returns an object created by a
        //constructor, it will have the wrong class. THEREFORE, if you override the clone method in a non-final class,
        //you should return an object obtained by invoking super.clone. If they all obey this rule then super.clone
        //will eventually invoke Object's clone method, creating an instance of the right class.

        //-As of 1.5, the clone method returns the actual class and not just Object. Because Object.clone returns
        // Object, PhoneNumber.clone must cast the result of super.clone()
        // before returning it which is preferable than requiring every caller of PhoneNumber.clone cast the result.
        //***GENERAL PRINCIPLE at play here is never make the client do anything the library can do for the client.***

        //-The problem with the clone architecture is that its incompatible with normal use of final fields referring
        //to mutable objects, except in cases where the mutable objects may be safely shared between an object and
        //its clone. In order to make it cloneable, may be necessary to remove final modifiers from some fields.

        //-A final approach to cloning complex objects is to call super.clone, set all of the fields in the result to
        //the original state, then call higher-level methods to regenerate the state of the object.

        //-One more detail: If you decide to make a thread-safe class implement Cloneable, remember that its clone
        //method must be properly synchronized just like any other method. Object's clone method is not synchronized,
        //so even if it is otherwise satisfactory, you may have to write a synchronized clone method that invokes
        //super.clone().

        //-Overall, classes that implement Cloneable should override clone with a public method whose return type
        // is the class itself. This method should first call super.clone and then fix any fields that need to be
        // fixed. Typically, this means copying any mutable objects that comprise the internal "deep structure" of the
        // object being cloned, and replacing the clone's references to these objects with references to the copies.
        // While these internal copies can generally be made by calling clone recursively, this is not always the best
        // approach. If the class contains only primitive fields or references to immutable objects, then it is
        // probably the case that no fields need to be fixed. There are exceptions to this rule. For example, a field
        // representing a serial number or other unique ID or a field representing the object's creation time will
        // need to be fixed, even if it is primitive or immutable.

        //-A fine approach to object copying is to provide a copy constructor to copy factory. A copy constructor is
        // simply a constructor that takes a single argument whose type is the class containing the constructor.

        //- Copy constructor can be better than implementing Cloneable. they don't rely on risk-prone extralinguistic
        // object creation mechanism; they don't demand unenforceable adherence to thinly documented conventions; they
        // don't conflict with the proper use of final fields; they don't throw unnecessary checked exceptions; and they
        // don't require casts. It is impossible to put a copy constructor or factory in an interface, Cloneable also
        // fails to function as an interface because it lacks a public clone method. Therefore, you aren't giving up
        // interface functionality by using a copy constructor in preference to a clone method.
        // Furthermore, a copy constructor can take an argument whose type is an interface implemented by the class,
        // which means you can choose the implementation type of the copy rather than forcing the client to accept the
        // type of the original by using a clone method.

        //-TL;DR - Given the problems with Cloneable, its safe to say that other interfaces should not extend it, and
        // that classes designed for inheritance should not implement it either. If you decide to design a class for
        // inheritance, be aware that if you choose not to provide a well-behaved protected clone method, it will be
        // impossible for subclasses to implement Cloneable.
    }

    public boolean cloneMethod() {
        Object x = new Object();

        /*
        The general contract for the clone method is weak. Here it is, copied from the
        specification for java.lang.Object [JavaSE6]:
        Creates and returns a copy of this object. The precise meaning of “copy” may
        depend on the class of the object. The general intent is that, for any object x,
        the expression
        */

        //x.clone() != x;
        //will be true, and the expression

        //x.clone().getClass() == x.getClass();
        //will be true, but these are not absolute requirements. While it is typically the
        //case that
        //x.clone().equals(x);
        //will be true, this is not an absolute requirement. Copying an object will typi-
        //cally entail creating a new instance of its class, but it may require copying of
        //internal data structures as well. No constructors are called.

        return true;
    }

    // this returns PhoneNumber, not Object and it is legal to do this.
    // It is now legal for an overriding method's return type to be a subclass of the overridden method's
    // return type.
    /*@Override public PhoneNumber clone() {
        try {
            return (PhoneNumber) super.clone();
        } catch(CloneNotSupportedException e) {
            throw new AssertionError();  // Can't happen
        }
    }*/

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

                //dont need to cast because it returns same type at run-time and would not work if it was final
                result.elements = elements.clone();
                return result;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }

    public class HashTable implements Cloneable {
        private Entry[] buckets;
        private class Entry {
            final Object key;
            Object value;
            Entry  next;
            Entry(Object key, Object value, Entry next) {
                this.key   = key;
                this.value = value;
                this.next  = next;
            }
        }

        // Broken - results in shared internal state!
        @Override public HashTable clone() {
            try {
                HashTable result = (HashTable) super.clone();
                result.buckets = buckets.clone();
                return result;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }
}
