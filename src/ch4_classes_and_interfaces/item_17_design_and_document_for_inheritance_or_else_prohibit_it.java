package ch4_classes_and_interfaces;

import java.io.FileInputStream;
import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
 * Date: 8/28/2014
 * Time: 10:46 AM
 */
public class item_17_design_and_document_for_inheritance_or_else_prohibit_it {

	//Classes that are meant to be used for inheritance need to include extra documentation explaining some details
	//to help programs subclass it properly. For example, self-use of overridable methods should be documented, because
	//a subclass may override a method that the parent class uses interntally, which could cause the parent class to fail.

	//The only way to be sure a class can be subclassed is to write at least 3 subclasses before releasing your code.

	//Choose wisely which fields are private and which are protected. Some fields will need to be protected in order to
	//for the class to be inherited, while fields that aren't used should be kept private.

	//Constructors should NEVER invoke overridable methods. When a subclass constructor is called, the parent constructor
	//is called first, and if a method that has been overridden is called the in the parent's constructor it can lead
	//to unexpected behaviour.

	//Classes that should not be inherited should prohibit inheritance. Either make the class final or make all of its
	//constructors private and provide static factories instead of constructors.

	public static void main(String [] args) {
		ChildClass child = new ChildClass();
		child.printMagicNumber();

	}

	private static class ParentClass{
		ParentClass() {
			printMagicNumber();
//			isBiggerThan(1);
		}

		public void printMagicNumber() {
		}
		public void isBiggerThan(Integer newNumber) {
		}
	}

	private static class ChildClass extends ParentClass{
		private final Integer magicNumber;
		ChildClass() {
			magicNumber = 42;
		}

		@Override public void printMagicNumber() {
			System.out.println(magicNumber);
		}
		@Override public void isBiggerThan(Integer newNumber) {
		   System.out.println(magicNumber.compareTo(newNumber));
		}
	}
}
