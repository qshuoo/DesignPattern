package com.qshuoo.factory.abstra;

public class FactoryA implements Factory {

	@Override
	public Product produce() {
		// TODO Auto-generated method stub
		return new ProductA();
	}

}
