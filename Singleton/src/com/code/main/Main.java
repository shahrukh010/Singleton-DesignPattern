package com.code.main;

import com.code.main.service.MyClass;
import com.code.main.service.Singleton;

public class Main {

	public static void main(String... strings) {

		/*
		 * MyClass instance = MyClass.getInstance();
		 * System.out.println(instance.hashCode()); MyClass inst =
		 * MyClass.getInstance(); System.out.println(inst.hashCode());
		 * 
		 * System.out.println(instance); System.out.println(inst);
		 * 
		 */

		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		System.out.println(s1);
		System.out.println(s2);
	}
}
