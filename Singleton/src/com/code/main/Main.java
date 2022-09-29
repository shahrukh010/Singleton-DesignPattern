package com.code.main;

import com.code.main.service.MyClass;

public class Main {

	public static void main(String... strings) {

		MyClass instance = MyClass.getInstance();
		System.out.println(instance.hashCode());
		MyClass inst = MyClass.getInstance();
		System.out.println(inst.hashCode());

		System.out.println(instance);
		System.out.println(inst);
	}
}
