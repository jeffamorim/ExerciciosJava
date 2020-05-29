package model;

public class eletrodomestico {

	private String tipo;
	private String modelo;
	private int voltagem;
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	
	
	public void ligar() {
		System.out.println("O "+this.tipo+ " " +this.modelo+" esta ligado no " +this.voltagem );
	}
	
	public void desligar() {
		System.out.println("O "+this.tipo+" " +this.modelo+" esta desligado");
	}

	
}
