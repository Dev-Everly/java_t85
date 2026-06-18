package atividade_pratica;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exec01 {
	/*
	 * Escreva um programa contendo uma Collection Queue (Fila) de Objetos do tipo
	 * string, para organizar uma fila por ordem de chegada dos Clientes de um
	 * Banco. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3: 1:
	 * Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente. 2:
	 * Listar todos os Clientes na fila 3: Chamar (retirar) uma pessoa da fila 0: O
	 * programa deve ser finalizado. Caso a fila esteja vazia, o programa deverá
	 * informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila.
	 */

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String cliente;
		int opcao;
		Queue<String> fila = new LinkedList<>();
		
		do {
		System.out.println("""
				=================Selecione a Opção Desejada=================
				1 - Adicionar um novo Cliente na fila
				2 - Listar todos os Clientes na fila
				3 - Chamar (retirar) uma pessoa da fila
				0 -  Sair
				""");
		opcao = leia.nextInt();
		
		switch(opcao) {
		case 1 : 
			 leia.nextLine(); // limpa o buffer

			    System.out.println("Digite o nome do cliente que deseja adicionar: ");
			    cliente = leia.nextLine();

			    fila.add(cliente);

			    System.out.println("Cliente adicionado!");
			    break;
			
		case 2 : 
			
			if (fila.isEmpty()) {
                System.out.println("A fila está vazia!");
            } else {
                System.out.println("\nClientes na fila:");

                for (String pessoa : fila) {
                    System.out.println(pessoa);
                }
            }

            break;
			
		case 3 : 
			if(fila.isEmpty()) {
				System.out.println("Programa encerrado fila vazia!");
			} else {
				  System.out.println("Cliente chamado: " + fila.poll());
			}
			break;
		case 0 : 
			System.out.println("Programa encerrado!");
			break;
		default:
			System.out.println("Opção Inválida !");
		
		}
		} while (opcao != 0);
		
		leia.close();
	}

}
