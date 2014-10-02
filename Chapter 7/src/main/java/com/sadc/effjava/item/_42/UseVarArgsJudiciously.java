package com.sadc.effjava.item._42;

/**
 * Created by Atlas on 10/1/2014.
 */
public class UseVarArgsJudiciously {

    //introduced in 1.5 allow 0 to many arguments to be passed
    //Every invocation of a varargs method causes an array allocation and initialization

    public void onlyVars(int... data){

        if(data.length == 0) {
            throw new IllegalArgumentException("Need some data");
        }
    }

    public void someVargs(int first, int... moreData){

    }
}
