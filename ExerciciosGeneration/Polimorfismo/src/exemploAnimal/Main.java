package exemploAnimal;


public class Main {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		
		System.out.println(emitirSomDoAnimal(cachorro));
		System.out.println(emitirSomDoAnimal(cavalo));
		System.out.println(emitirSomDoAnimal(preguica));
		
		System.out.println("\n-------------------------||-------------------------\n");
		
		cachorro.setNome("Bilu");
		cachorro.setIdade(7);
		
		cavalo.setNome("Alazao");
		cavalo.setIdade(8);
		
		preguica.setNome("Sid");
		preguica.setIdade(4);
		
		Veterinario veterinario = new Veterinario();
		
		
		String exame = veterinario.examinar(cachorro, cavalo, preguica);
		
		System.out.println(exame);
			
		
	}
	public static String emitirSomDoAnimal (Animal animal) {
		return animal.emitirSom();
	}
		
		
	

}
