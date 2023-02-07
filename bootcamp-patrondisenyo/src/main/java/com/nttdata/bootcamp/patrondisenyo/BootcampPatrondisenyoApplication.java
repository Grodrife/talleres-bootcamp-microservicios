package com.nttdata.bootcamp.patrondisenyo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.nttdata.bootcamp.patrondisenyo.cadenamando.Unidad;
import com.nttdata.bootcamp.patrondisenyo.cadenamando.UnidadDeMando;
import com.nttdata.bootcamp.patrondisenyo.decorator.PersonDecorator;
import com.nttdata.bootcamp.patrondisenyo.decorator.PersonDecoratorI;
import com.nttdata.bootcamp.patrondisenyo.facade.Facade;
import com.nttdata.bootcamp.patrondisenyo.proxy.AbstractPersonProxy;
import com.nttdata.bootcamp.patrondisenyo.proxy.PersonProxy;
import com.nttdata.bootcamp.patrondisenyo.proxy.ProxyBBDD;
import com.nttdata.bootcamp.patrondisenyo.singleton.PersonSingleton;

@SpringBootApplication
//@ComponentScan("com.nttdata.bootcamp.patrondisenyo")
public class BootcampPatrondisenyoApplication {

//	@Autowired
//	private static ApplicationContext context;
	
	
	public static void main(String[] args) {
		//PersonSingleton person = ((PersonSingleton) context.getBean("personPrototype"));
		SpringApplication.run(BootcampPatrondisenyoApplication.class, args);
		
//		PersonDecorator p1 = new PersonDecorator();
//		PersonDecoratorI personI = new PersonDecorator();
		
//		Facade p1 = new Facade("Nombre");
//		System.out.println(p1);
		
//		PersonProxy p1 = new PersonProxy();
//		p1.setName("Nombre");
//		p1.setAge(23);
//		AbstractPersonProxy proxyBBDD = new ProxyBBDD(p1);
//		proxyBBDD.operacion();
		
//		Unidad u1 = new Unidad("u1");
//		Unidad u2 = new Unidad("u2");
//		Unidad u3 = new Unidad("u3");
//		UnidadDeMando udm = new UnidadDeMando();
//		
//		u1.estableceMando(u2);
//		u2.estableceMando(u3);
//		
//		udm.anyadirEjercito(u1);
//		udm.anyadirEjercito(u2);
//		udm.anyadirEjercito(u3);
//		
//		udm.ejecutaOrden("Orden");
		
		
	}

}
