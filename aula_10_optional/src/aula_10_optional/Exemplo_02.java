package aula_10_optional;

import java.util.Optional;

public class Exemplo_02 {

	public static void main(String[] args) {
		String frases [] = new String [5];
		
		frases[2] = ("Generation Brasil");
		
		//Optional Vazio
		Optional<String> optionalVazio = Optional.empty();
		System.out.println("Exibi o valor de optional vazio " + optionalVazio);
		System.out.println("O optnioVazio está vazio ? " + optionalVazio.isEmpty());
		
		
		//Optional com dados
		Optional<String> valorIndice2 = Optional.of(frases[2]);
		System.out.println("\nExibir o valor de valorIndice " + valorIndice2);
		System.out.println("O valorIndice2 tem alguma coisa ? " + valorIndice2.isPresent());
		System.out.println("Qual é o valor armazenado em valorIndice2? " + valorIndice2.get());
	}

}
