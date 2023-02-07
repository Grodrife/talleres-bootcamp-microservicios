package com.nttdata.bootcamp.patrondisenyo.proxy;

public class ProxyBBDD extends AbstractPersonProxy{

	public ProxyBBDD(PersonProxyI person) {
		super(person);
	}
	
	@Override
	public void before() {
		System.out.println("Mensaje de before");
	}
	
	@Override
	public void after() {
		System.out.println("Mensaje de after");
	}
}
