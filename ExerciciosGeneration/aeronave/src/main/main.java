package main;

import model.Aeronave;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aeronave aeronave = new Aeronave();
		
		aeronave.setModelo("Boeing");
		aeronave.setCompanhia("Azul");
		aeronave.setCapacidadePassageiros(100);
		aeronave.setVoar(true);
		
		aeronave.info();
	}

}
