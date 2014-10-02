package com.sadc.effjava.item._43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Atlas on 10/1/2014.
 */
public class ReturnEmptyArraysOrCollectionsNotNulls {
    private final List<String> data = new ArrayList<String>(Arrays.asList(new String[]{"item1", "item2"}));
    private static final String[] EMPTY_DATA = new String[0];

    public String[] getData() {
        return data.toArray(EMPTY_DATA);
    }

    public List<String> getDataList(){
        if(data.isEmpty()) {
            return Collections.emptyList();
        }
        else {
            return data;
        }
    }


    //in short never return null for collections.

}
