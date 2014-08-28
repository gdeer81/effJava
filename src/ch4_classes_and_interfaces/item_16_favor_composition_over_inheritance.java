package ch4_classes_and_interfaces;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

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
 * Date: 8/27/2014
 * Time: 5:18 PM
 */
public class item_16_favor_composition_over_inheritance {

	//Unlike method invocation, inheritance violates encapsulation. This is because in inheritance, the subclass
	//depends on the implementation details of the super. If the super's implementation is changed, then the subclass
	//may not function properly. The book gives an example of extending HashSet and assuming to know what addAll does
	//without knowing about its implementation.

	//Rather than extend an existing class, create a private field in your subclass that references an instance of the
	//super class. This is "composition". Create methods in your subclass that call the methods of the superclass.
	//This is "forwarding".

	//TODO: Implement wrapper class

	//Creating a wrapper class like this is known as the "decorator" pattern. The combination of composition and
	//forwarding is called "delegation".

	//Use the "is-a" test to determine whether you should implement the decorator pattern or use inheritance. If every
	//B is not truly an A, then don't extend.

	public static void main(String [] args) {

		Properties propertiesFail = new Properties();

		System.out.println(propertiesFail.getProperty("test"));
		System.out.println(propertiesFail.get("test"));
		try(FileInputStream in = new FileInputStream("src/ch4_classes_and_interfaces/test.properties")) {
			propertiesFail.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(propertiesFail.getProperty("test"));
		System.out.println(propertiesFail.get("test"));
		List numbers = new ArrayList<Integer>();
		numbers.add(42);
		//Properties extends HashTable, but it is not a HashTable. It requires all of its keys to be strings in order for it
		//to work, but since we have access to HashTable functions, we can break Properties by using a HashTable method.
		propertiesFail.put("test", numbers);
		System.out.println(propertiesFail.getProperty("test"));
		System.out.println(propertiesFail.get("test"));
	}
}
