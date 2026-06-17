package atividade_pratica;

import java.util.Scanner;

public class Exec02 {
	/*
	 * Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e
	 * mostre na tela quantos números são pares e quantos número são ímpares. Veja o
	 * exemplo abaixo
	 */
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numeros = 0, pares = 0,impares = 0;
		 
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite " + i + "º número ");
			
			numeros = leia.nextInt();
			if(numeros % 2 == 0) {
				pares++;
				
			}else {
				impares++;
			}
		}
		
		System.out.println("Total de números pares: " + pares );
		System.out.println("Total de números impares: " + impares );
		
		
		leia.close();
	}

}
