package com.code.main.service;

public class Singleton {

	//volatile:-ensure that if any one thread changes volatile instance then all thread will be reflect.
	private volatile static Singleton uniqueInstance;

	public Singleton() {
	}

	public static Singleton getInstance() {

		if (uniqueInstance == null) {

			synchronized ((Singleton.class)) {

				if (uniqueInstance == null)
					uniqueInstance = new Singleton();
			}
		}
		return uniqueInstance;

	}

}
