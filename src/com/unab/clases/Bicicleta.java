package com.unab.clases;

import com.unab.Interfaz.Rueda;

public class Bicicleta implements Rueda {
	
	public Bicicleta() {
		
	}

	@Override
	public void avanzar() {
		System.out.println("Esta BICICLETA avanza");
		
	}

	@Override
	public void retroceder() {
		System.out.println("Esta BICICLETA retrocede");
		
	}

}
