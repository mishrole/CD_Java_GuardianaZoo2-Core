package com.codingdojo.guardianazoo2.model;

public class Gorila extends Mamifero {
	
	public Gorila() {
		super(100);
	}
	
	public void lanzarAlgo() {
		int energia = this.mostrarEnergia();
		int decremento = 5;
		this.setNivelDeEnergia(energia - decremento);
		System.out.println("Lanz� algo. Su energ�a se reduce en " + decremento);
	}
	
	public void comerBananas() {
		int energia = this.mostrarEnergia();
		int incremento = 10;
		this.setNivelDeEnergia(energia + incremento);
		System.out.println("Comi� bananas. Su energ�a incrementa en " + incremento);
	}
	
	public void escalar() {
		int energia = this.mostrarEnergia();
		int decremento = 10;
		this.setNivelDeEnergia(energia - decremento);
		System.out.println("Trep� un �rbol. Su energ�a se reduce en " + decremento);
	}
}
