package model;

public class veiculo {
	
	
		private String modelo;
		private String cor;
		private String combustivel;
		private float velMax;
		
		private float velocidade = 0;
		

		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public String getCombustivel() {
			return combustivel;
		}
		public void setCombustivel(String combustivel) {
			this.combustivel = combustivel;
		}
		
		
		
		
		
		public float getVelMax() {
			return velMax;
		}
		public void setVelMax(float velMax) {
			this.velMax = velMax;
		}
		
		public String getCor() {
			return cor;
		}
		
		public void setCor(String cor) {
			this.cor = cor;
		}
		
		public void acelerar() {
			
			if(this.velocidade < this.velMax) {
				this.velocidade = this.velocidade + 10;
				System.out.println("A velocidade atual é de: " + this.velocidade + " km/h");
			}else {
				this.velocidade = this.velocidade - 10;
				System.out.println("A velocidade atual é de: " + this.velocidade + " km/h");
			}
			
		}
		
		public void frear() {
			if(this.velocidade == 0) {
				System.out.println("O veículo parou.");
			}else {
				this.velocidade = this.velocidade - 10;
				System.out.println("A velocidade atual é de: " + this.velocidade + " km/h");
			}
			
		}
}
