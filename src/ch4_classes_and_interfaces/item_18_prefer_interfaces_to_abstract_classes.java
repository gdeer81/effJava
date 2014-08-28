package ch4_classes_and_interfaces;

/**
 * $Id$
 * <p/>
 * Copyright (c) 2012 HEB
 * All rights reserved.
 * <p/>
 * This software is the confidential and proprietary information
 * of HEB.
 * <p/>
 * Created with IntelliJ IDEA.
 * User: n625582
 * Date: 8/28/2014
 * Time: 10:54 AM
 */
public class item_18_prefer_interfaces_to_abstract_classes {

	//Interfaces are easier to introduce than abstract classes, since abstract classes require its subclasses to extend it.

	//Interfaces can easily be used for mixins, abstract classes cannot since a class can only extend one abstract class.

	//If you would like to provide implementation details for an interface, create a "skeletal implementation" of the interface
	//called AbstractInterface (like AbstractSet, or AbstractList) that implements the nontrivial methods of that interface.

	//One advantage of an abstract class is that you can implement a new method that all of its subclasses will immediately
	//have access to, but for an interface you'd have to implement it across all your subclasses. Creating skeletal or
	//simple abstract implementations of interfaces can provide this functionality. However, once an interface is released
	//and widely implements, it is impossible to change.

	//In summary, if you value an evolving class more than a flexible one, then use abstract class over an interface. But
	//generally, interfaces are more powerful and more flexible and abstract classes are very limited.
}
