package com.sadc.effjava.item._44;

/**
 * Created by Atlas on 10/1/2014.
 */
public class WriteDocCommentsForExposedAPI {

    /**
     * To document your API properly, you must precede every exported class,
     interface, constructor, method, and field declaration with a doc comment.
     */


    private abstract class GoodAPIDoc<T>{

        /**
         * Returns the Data you just passed in.
         * <p>This method is not useful at all.</p>
         * @param data data to be returned
         * @return the data you passed in
         * @throws java.lang.IllegalArgumentException if your data is bad data.
         *  ({@code index < 0 || index >= this.size()})
         */
        T get(T data) throws IllegalArgumentException{
            T t = data;
            return data;
        }

        //use {@literal} for HTML metacharacters

        //javadoc will translate the html for us.
        //No two membors or constructors in a class or interface should have the same summary description

    }
//always document all type parameters for generics
    /**
     * An Object that maps programmers to code.
     * @param <S> the type of data
     * @param <A> the key of the programmer
     * @param <D> the type of values
     * @param <C> the other stuff
     */
    private interface genericInterface<S,A,D,C>{

    }

    //for enums document the constants
    /**
     * An instrument section of a symphony orchestra.
     */
    public enum OrchestraSection {
        /** Woodwinds, such as flute, clarinet, and oboe. */
        WOODWIND,
        /** Brass instruments, such as french horn and trumpet. */
        BRASS,
        /** Percussion instruments, such as timpani and cymbals */
        PERCUSSION,
        /** Stringed instruments, such as violin and cello. */
        STRING;
    }

}

