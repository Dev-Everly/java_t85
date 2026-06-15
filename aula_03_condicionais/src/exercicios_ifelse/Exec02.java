package exercicios_ifelse;

import java.util.Scanner;

public class Exec02 {
	/*
	 * Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre
	 * na tela uma mensagem indicando se este número é par ou ímpar e se o número é
	 * positivo ou negativo
	 */
 	public static void main(String[] args) {
 		Scanner leia = new Scanner(System.in);
 		int numero;
 		
 		
 		System.out.println("Digite um número: ");
 		numero = leia.nextInt();
 		
 		if(numero >= 0 && numero % 2 == 0) {
 			 System.out.println("O número " + numero + "  é par e positivo!");
 		}else if (numero < 0 && numero % 2 == 0) {
 			System.out.println("O número " + numero + " é par e negativo!");
 		}else if (numero >= 0 && numero % 2 != 0) {
 			System.out.println("O número " + numero + " é impar e positivo!");

 		} else {
 			System.out.println("O número " + numero + " é impar e negativo!");
 		}
 		
 		leia.close();
 		
 		
		
	}

}
