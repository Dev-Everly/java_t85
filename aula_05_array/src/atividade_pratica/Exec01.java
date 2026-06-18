package atividade_pratica;

import java.util.Arrays;
import java.util.Scanner;

public class Exec01 {
	/*
	 * Dado um vetor contendo 10 números inteiros não ordenados e não repetidos,
	 * construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário
	 * irá digitar um número e o programa deve exibir na tela a posição deste número
	 * no vetor. Caso o número não seja encontrado, a mensagem: “Não foi
	 * encontrado!” deve ser exibida na tela
	 */	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
		 
		 int numero_digitado = 0, indice = -1;
		 
		 int vetor_inteiros [] = {2, 5, 1, 3, 4, 9, 7, 8, 10,6};
		 
		 System.out.println("Digite um número : ");
		 numero_digitado = leia.nextInt();
		 
		 for(int i =0; i < vetor_inteiros.length; i++) {
			 if(vetor_inteiros [i] == numero_digitado) {
				 indice = i;
				 break;
			 }
		 }
		 
		 
		 if(indice != -1) {
			    System.out.println("O número está na posição: " + indice);
			} else {
			    System.out.println("Não foi encontrado!");
			}
		 
		 
			/* Usando binary search
			 * Arrays.sort(vetor_inteiros); 
			 * int posicao = Arrays.binarySearch(vetor_inteiros, numero_digitado);
			 * 
			 * if(numero_digitado >= 0) { System.out.println("O número " + numero_digitado +
			 * " Está na posição " + posicao ); }else {
			 * System.out.println("Número não encontrado! "); }
			 */
	}

}
