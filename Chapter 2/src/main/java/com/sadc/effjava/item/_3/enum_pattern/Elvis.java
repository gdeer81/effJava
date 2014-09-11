package com.sadc.effjava.item._3.enum_pattern;

/**
 * Created by k557782 on 8/14/2014.
 * Enum singleton - the preferred approach
 * This approach is functionally equivalent to the public field approach, except that it is more concise, provides the
 * serialization machinery for free, and provides an ironclad guarantee against multiple instantiation, even in the
 * face of sophisticated serialization or reflection attacks.
 */
public enum Elvis {
    INSTANCE;

    public void leaveTheBuilding() {
    }
}
