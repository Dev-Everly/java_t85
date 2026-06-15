package exercicios_ifelse;

import java.util.Scanner;

public class Exec01 {
//	  Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela 
//	se a soma de A + B é maior, menor ou igual a C.   
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		System.out.println("Digite o primeiro valor: ");
		a = leia.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = leia.nextInt();
		System.out.println("Digite o terceiro valor: ");
		c = leia.nextInt();
		
		if(a + b > c ) {
			System.out.println("A soma de A + B é maior que C");
		}else if (a + b < c) {
			System.out.println("A soma de A + B é menor do que C");
		} else {
			System.out.println("A soma de A + B é Igual a C ");
		}
		
		
		
		
		
		leia.close();
		
		
 
	}

}
