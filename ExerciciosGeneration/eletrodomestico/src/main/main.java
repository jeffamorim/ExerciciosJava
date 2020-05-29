package main;

import model.eletrodomestico;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eletrodomestico eletrodomestico = new eletrodomestico();
		
		eletrodomestico.setTipo("Aspirador de po");
		eletrodomestico.setModelo("Compacto");
		eletrodomestico.setVoltagem(110);
		
		eletrodomestico.ligar();
		eletrodomestico.desligar();
	}

}
