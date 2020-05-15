package Exercicios;

public class Exercicio1 {
	
	public static void main (String args[]) {
		int resultadosoma = 0;
		
		for(int i=1; i <= 500; i++) {
			if( (i%3 == 0) && (i%2 != 0)) {
				resultadosoma+= i;
				System.out.println("O resultado é: " +resultadosoma);
			}
		}
	}
}
