package atividade_pratica;

import java.util.Scanner;
/*Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em seguida, mostre na tela:
Todos os elementos dos índices ímpares do vetor 
Todos os elementos do vetor que são números pares
A Soma de todos os elementos do vetor
A Média de todos os elementos do vetor, armazenada em uma variável do tipo real*/

public class Exec02 {

	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int soma = 0 ;
		float media = 0.0f;
		int [] numeros = new int[10];
		
		for(int i = 0; i < numeros.length; i++ ) {
			System.out.println("Digite o " + (i + 1) + "ºnúmero");
			numeros[i] = leia.nextInt();
			
			}
		
		System.out.println("\nElementos nos índices ímpares:");

		for(int i = 0; i < numeros.length; i++) {
		    if(numeros[i] % 2 != 0) {
		        System.out.print( i  + " ");
		    }
		}
		
		System.out.println("\n\nElementos pares:");

		for(int i = 0; i < numeros.length; i++) {
		    if(numeros[i] % 2 == 0) {
		        System.out.print(numeros[i] + " ");
		    }
		}
		
		for(int i = 0;i < numeros.length;i++) {
			soma += numeros[i];
		}
		
		System.out.println("\nSoma : " + soma);
	
		media = (float)soma/ numeros.length;
		
		System.out.printf("Média : %.2f ", media);
		leia.close();
	}

}
