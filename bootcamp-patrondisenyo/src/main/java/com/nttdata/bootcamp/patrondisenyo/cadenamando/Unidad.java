package com.nttdata.bootcamp.patrondisenyo.cadenamando;

public class Unidad {

	protected Unidad mando;

	protected String nombre;

	public Unidad(String nombre) {
		this.nombre = nombre;
	}

	public void estableceMando(Unidad mando) {
		this.mando = mando;
	}
	
	public void ejecutarOrden(String orden) {
		if(mando != null) {
			System.out.println("Orden ejecutada por " + getNombre() + " --> " + orden);
			System.out.println(getNombre() + " mandando orden");
			mando.ejecutarOrden(orden);
		}else {
			System.out.println("Orden ejecutada por " + getNombre() + " --> " + orden);
			System.out.println("Nadie a quien mandar orden");
		}
	}
	
	public String getNombre() {
		return this.nombre;
	}

}
