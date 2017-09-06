package com.qshuoo.factory.normal;

public class Factory {
	
	/*public Product produce(String type) {
		if("A".equals(type)) {
			return new ProductA();
		}
		if("B".equals(type)) {
			return new ProductB();
		}
		return null;
	}*/
	
	public static Product produceA() {
		return new ProductA();
	}
	
	public static Product produceB() {
		return new ProductB();
	}

}
