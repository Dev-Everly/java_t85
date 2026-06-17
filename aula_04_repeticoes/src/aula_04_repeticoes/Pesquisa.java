package aula_04_repeticoes;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	
		int esportes, idade , totalRespostas = 0, somaIdades = 0, futebol = 0;
		char continua  = 'S';
		
		System.out.println("Qual é a sua idade? ");
		idade = leia.nextInt();
		
		while(continua == 'S') {
		System.out.println( """
		=== Pesquisa Sobre Esportes Favoritos ===
		1 - Futebol
		2 - Voleibol
		3 - Basquetebol
		4 - Outros
		
		
		""");
		

	esportes = leia.nextInt();
	// Estatísticas
	
	//total de pessoas que responderam
	totalRespostas ++;
	// soma total das idades das pessoas que responderam a pesquisa
	somaIdades += idade;
	
	//total pessoas que gostam de futebol
	if(esportes == 1 )
		futebol ++;
	
	
	do {
		System.out.println("Deseja Continuar ? (S/N)");
		continua = leia.next().toUpperCase().charAt(0);
		}while(!(continua == 'S') && !(continua == 'N'));
		
	float mediaIdades = somaIdades / totalRespostas;	
	
	System.out.printf("Média das Idades: %.2f\n", mediaIdades);
	System.out.printf("Total de pessoas que gostam de futebol: %.d\n", futebol);
	
	leia.close();
	}
}

}
