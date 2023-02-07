package com.nttdata.bootcamp.patrondisenyo.proxy;

public abstract class AbstractPersonProxy implements PersonProxyI{

	private PersonProxyI person;
	
	public AbstractPersonProxy(PersonProxyI person) {
		this.person = person;
	}
	
	@Override
	public void operacion() {
		before();
		person.operacion();
		after();
	}
	
	public abstract void before();
	
	public abstract void after();

	
	//Person entidad = Person.builder.age.name.build();
	//AbstractPersonProxy proxyBBDD = new ProxyBBDD(entidad);
	//proxyBBDD.operacion();
}
