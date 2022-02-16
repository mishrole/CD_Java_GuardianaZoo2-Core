package com.codingdojo.guardianazoo2.model;

public class Mamifero {
	private int nivelDeEnergia;
	
	public Mamifero(int energia) {
		setNivelDeEnergia(energia);
	}

	public int mostrarEnergia() {
		System.out.println("Energía actual: " + nivelDeEnergia);
		return nivelDeEnergia;
	}

	public void setNivelDeEnergia(int nivelDeEnergia) {
		this.nivelDeEnergia = nivelDeEnergia;
	}
}
