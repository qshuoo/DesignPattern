package com.qshuoo.factory.normal;

public class Client {
	public static void main(String[] args) {
//		Factory factory = new Factory();
		/*
		Product pa = factory.produce("A");
		Product pb = factory.produce("B");
		pa.create();
		pb.create();
		*/
		Product a = Factory.produceA();
		Product b = Factory.produceB();
		a.create();
		b.create();
	}

}
