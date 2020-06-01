package exemploAnimal;

public class Preguica extends Animal{
	
	@Override
	public String emitirSom() {
		
		return "A preguica esta fazendo barulho";
	}
	
	@Override
	public String acao() {
		return "A preguica esta subindo na arvore";
	}
}
