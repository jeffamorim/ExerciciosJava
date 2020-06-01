package exemploAnimal;

public class Veterinario {
	
	public String examinar(Animal cac, Animal cav, Animal preg) {
		String resposta = "" + cac.emitirSom() + " porque foi examinado";
		String resposta1 =  "" + cav.emitirSom()+ " porque foi examinado";
		String resposta2 =  "" + preg.emitirSom()+ " porque foi examinado";
		
		return resposta + "\n " + resposta1 + "\n " + resposta2 ;
	}
}
