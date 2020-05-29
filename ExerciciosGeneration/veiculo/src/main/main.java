package main;

import model.Carro;
import model.Moto;


public class main {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.setPortas(4);
		carro.setCor("preto");
		carro.setAutomatico(true);
		
		carro.acelerar();
		carro.frear();
		
		System.out.println("\n-----------------------||-------------------\n");
		
		Moto moto = new Moto();
		
		moto.setModelo("CG");
		moto.setCor("Preto");
		moto.setCilindradas(150);
		
		moto.acelerar();
		moto.frear();
	}

}
