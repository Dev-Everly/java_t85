package exercicios_switchCase;

import java.util.Scanner;

public class Exec05 {
	/* Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de um item (número inteiro de 1 a 6) e a quantidade 
	   comprada deste item (número inteiro)*/
 
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double valor =0;
		
		System.out.println("Digite o Código do Produto: ");
		int codigo = leia.nextInt();
		
		System.out.println("Quantidade: ");
		
		int quantidade = leia.nextInt();
		
		
		
		
		switch (codigo) {
		case 1 :
			System.out.println("Cachorro Quente");
			  valor = 10.00;
			  break;
		case 2 :
			System.out.println("Produto : X - Salada");
			  valor = 15.00;
			  break;
		case 3 :
			System.out.println("Produto : X - Bacon");
			  valor = 18.00;
			  break;	  
		case 4 :
			System.out.println("Produto : Bauru");
			  valor = 12.00;
			  break;	
		case 5 :
			System.out.println("Produto : Refrigerante");
			  valor = 8.00;
			  break;
		case 6 :
			System.out.println("Produto : Suco de Laranja");
			  valor = 13.00;
			  break;	  
			  
		default: 
			System.out.println("Códido Inválido!");
		}
		
		
		double valorTotal = quantidade * valor;
		
		System.out.printf("\n Valor Total :  %.2f",valorTotal);
		 
		leia.close();
		
		
		
	}
	
	
}
