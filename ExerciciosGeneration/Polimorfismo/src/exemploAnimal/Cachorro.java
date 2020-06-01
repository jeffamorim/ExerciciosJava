package exemploAnimal;

public class Cachorro extends Animal {
	
	@Override
	public String emitirSom() {
		
		return "O cachorro esta Latindo";
	}
	
	@Override
	public String acao() {
		return "O cachorro esta correndo";
	}


}
