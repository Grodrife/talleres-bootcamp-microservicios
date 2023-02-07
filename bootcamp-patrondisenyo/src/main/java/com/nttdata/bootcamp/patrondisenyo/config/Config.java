package com.nttdata.bootcamp.patrondisenyo.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.nttdata.bootcamp.patrondisenyo.prototype.PersonPrototype;
import com.nttdata.bootcamp.patrondisenyo.singleton.PersonSingleton;

@Configuration
public class Config {

	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public PersonPrototype prototypePerson() {
		return new PersonPrototype();
	}
	
	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public PersonSingleton singletonPerson() {
		return new PersonSingleton();
	}
}


