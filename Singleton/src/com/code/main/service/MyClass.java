package com.code.main.service;

public class MyClass {

	// only one object valid for entire application
	// private static MyClass uniqueInstance;

//****************************************************************************************************

	//Eagerly creating singleton class.
	//Eagerly avoiding problem whatever we faced in synchronized method
	//because synchronization is little bit expensive. so Eagerly avoiding problem.
	private static MyClass uniqueInstance = new MyClass();


//****************************************************************************************************

	//Eagerly creating singleton class.
	public MyClass() {
	}

	// for multi threaded environment getInstance() is not good it raises issue
	// Because of we already know to here multiple thread can run at a time.
	//lazy way to create singleton.
	/*
	 * public static MyClass getInstance() {
	 *  if (uniqueInstance == null) return
	 * uniqueInstance = new MyClass();
	 * 
	 * return uniqueInstance; }
	 */

//	public static synchronized MyClass getInstance() {
//
//		// adding synchronized keyword it makes our singleton  thread safe.
//		//but when you use synchronized keyword it makes little complex or performance issue.
//		if (uniqueInstance == null) {
//
//			return uniqueInstance = new MyClass();
//		}
//		return uniqueInstance;
//	}

	public static MyClass getInstance() {

		return uniqueInstance;
	}
}
