package atividade_pratica;

import java.util.Scanner;

public class Exec03While {
	

	/*
	 * Escreva um algoritmo em Java, que leia a idade de várias pessoas (números
	 * inteiros), via teclado e mostre na tela o total de pessoas cuja idade seja
	 * menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos. A
	 * leitura dos dados deve ser finalizada ao digitar uma idade negativa
	 */

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade = 0, idade21 = 0, idade50=0;
		
		while( idade >= 0) {
			
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			 if(idade >=0 ) {
			if(idade < 21 ) {
				idade21++;
				

			} else if( idade > 50) {
				idade50++;

			}
			 }
					
		}
		System.out.println("Total de pessoas maiores de 21 " + idade21);
		System.out.println("Total de pessoas maiores de 50 " + idade50);

		
		leia.close();
	}

}
