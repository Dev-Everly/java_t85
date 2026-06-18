package atividade_pratica;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Exe02 {
 
	/*
	 * Escreva um programa contendo uma Collection Stack (Pilha) de Objetos string,
	 * para organizar a retirada de livros de uma pilha. O programa deverá ter um
	 * Menu que aceitará as opções 0, 1, 2 e 3: 1: Adicionar um novo livro na pilha.
	 * Deve solicitar o nome do livro. 2: Listar todos os livros da Pilha 3: Retirar
	 * um livro da pilha 0: O programa deve ser finalizado. Caso a pilha esteja
	 * vazia, ao tentar retirar um livro da pilha, o programa deverá informar que a
	 * pilha está vazia.
	 */

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao = 0;
		String livro   ;
		
		 Deque <String> pilha = new ArrayDeque<>();
		 
		 do {
			 System.out.println("""
			 		===========Escolha uma Opção do Menu===========
			 		1 - Adicionar livro
			 		2 - Listar todos os livros
			 		3 - Remover livro
			 		0 - Finalizar
			 		""");
			 
			 opcao = leia.nextInt();
			 
			 switch(opcao) {
			 case 1:
				 leia.nextLine(); //
				 System.out.println("Digite o nome do livro que deseja adicionar: ");
				 livro = leia.nextLine();
				 pilha.add(livro);
				 
				 System.out.println("Livro " + livro + " a dicionado!");
				 break;
				 
			 case 2:
				 if(pilha.isEmpty()) {
					 System.out.println("Pilha está vazia !");
				 }else {
					 for(var livros : pilha) {
						 System.out.println(livros);
					 }
				 }
				 break;
			 case 3:
				 if(!pilha.isEmpty()) {
					String removido = pilha.pop();
					System.out.println("Livro removido : " + removido);
					 } 
				 
				 break;
			 case 0 :
				 System.out.println("Programa finalizado");
				 
			 }
			 
			 
		 } while(opcao !=0);
		 
		 
		 leia.close();
	}
	
	

}
