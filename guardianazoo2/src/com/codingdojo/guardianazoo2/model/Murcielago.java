package com.codingdojo.guardianazoo2.model;

public class Murcielago extends Mamifero {
	
	public Murcielago() {
		super(300);
	}
	
	public void volar() {
		int energia = this.mostrarEnergia();
		int decremento = 50;
		System.out.println("BAT BAT BAT");
		this.setNivelDeEnergia(energia - decremento);
	}
	
	public void comerHumanos() {
		int energia = this.mostrarEnergia();
		int incremento = 25;
		System.out.println("ÑAM ÑAM ÑAM");
		this.setNivelDeEnergia(energia + incremento);
	}
	
	public void atacarPueblo() {
		int energia = this.mostrarEnergia();
		int decremento = 100;
		System.out.println("¡FUEGOOOO!");
		this.setNivelDeEnergia(energia - decremento);
	}
}
