package aula_01_variaveis;

import java.util.Locale;
import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		// caso a entrada seja com . leia.useLocale(Locale.US);
			
		int numero1 = 10;
		int numero2 = 5;
		float numero3, numero4;
		float teste = 4.5f;
		String nome ;
		char opcao = 'N'; // aceita somente um caractere
		
		
		System.out.println("Variável número1 = " + numero1);
		
		System.out.println("Variável número2 = " + numero2);
		
		System.out.printf("%d + %d = %d\n ", numero1, numero2, numero1 + numero2);
		
		System.out.println("\nDigite o primeiro valor real: ");
		numero3 = leia.nextFloat();
		
		System.out.println("\nDigite o segundo valor real: ");
		numero4 = leia.nextFloat();
		
		System.out.printf("%.2f x %.2f = %.2f", numero3, numero4, numero3 * numero4);
		
		
		System.out.println("\nEscreva seu nome : " );
		nome = leia.next();
		
		
		
	}

}
