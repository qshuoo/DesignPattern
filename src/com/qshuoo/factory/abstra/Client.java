package com.qshuoo.factory.abstra;

public class Client {
	public static void main(String[] args) {
		Factory fa = new FactoryA();
		Factory fb = new FactoryB();
		Product a = fa.produce();
		Product b = fb.produce();
		a.create();
		b.create();
	}

}
