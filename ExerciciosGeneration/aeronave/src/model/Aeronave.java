package model;

public class Aeronave {

	private String modelo;
	private String companhia;
	private	int capacidadePassageiros;
	private boolean voar;
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCompanhia() {
		return companhia;
	}
	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}
	public int getCapacidadePassageiros() {
		return capacidadePassageiros;
	}
	public void setCapacidadePassageiros(int capacidadePassageiros) {
		this.capacidadePassageiros = capacidadePassageiros;
	}
	public boolean isVoar() {
		return voar;
	}
	public void setVoar(boolean voar) {
		this.voar = voar;
	}
	
	public void info() {
		System.out.println("A Aeronave do tipo " + this.modelo + " da companhia " + this.companhia + " com a capacidade de " + this.capacidadePassageiros + " esta " + this.voar);
	}
}
