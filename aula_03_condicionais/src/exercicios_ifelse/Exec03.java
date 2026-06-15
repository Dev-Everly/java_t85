package exercicios_ifelse;

import java.util.Scanner;

public class Exec03 {
	/*
	 * Para doar sangue é necessário ter entre 18 e 69 anos de idade. Pessoas com
	 * idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação.
	 * Escreva um Algoritmo em Java que obtenha via teclado o nome do doador
	 * (String), a idade (inteiro) do doador e se é a primeira doação (boolean). De
	 * acordo com as Regras para a doação, mostre na tela se o doador está Apto ou
	 * Não Apto para doar sangue
	 */	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
		 
		 
		 String nome;
		 int idade;
		 boolean primeiraDoacao;
		 
		 System.out.println("Digite o nome do doador: ");
		 nome = leia.nextLine();
		 System.out.println("Digite a idade do doador: ");
		 idade = leia.nextInt();
		 System.out.println("Primeira doação de sangue ? ");
		 primeiraDoacao = leia.nextBoolean();
		 
		 if (idade >= 60 && idade <= 69 && primeiraDoacao == false ) {
			 System.out.printf("%s está apta para doar sangue !", nome);
		 } else if(idade >= 18 && idade <= 60 ) {
			 System.out.printf("%s  está apta para doar sangue !", nome);

		 } else {
			 System.out.printf("%s não está apta para doar sangue !", nome);

		 }
		 
		 
		 leia.close();
	}

}
