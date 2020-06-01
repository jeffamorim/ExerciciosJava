package exemploAnimal;

public class Cavalo extends Animal{

	@Override
	public String emitirSom() {
		
		return "O cavalo esta Relinxando";
	}
	
	@Override
	public String acao() {
		return "O cavalo esta correndo";
	}
}
