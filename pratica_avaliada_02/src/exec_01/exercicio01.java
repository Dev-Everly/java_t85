package pratica_avaliada_02;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float soma = 0f ; 
		
		ArrayList<Integer> numeros = new ArrayList<>();
		 
		
		for(int i = 1; i <= 5; i++) {
		  System.out.println("Digite o " + i + "º número");
		  int num = leia.nextInt();
		  numeros.add(num);
		  
		  soma += num;
		}
		
		int maior = numeros.get(0);
		
		/*
		 * for(int i = 0 ; i < numeros.size(); i++ ) { if(numeros.get(i) > maior) {
		 * maior = numeros.get(i); } }
		 */
		
		for(int num : numeros) {
			if(num > maior) {
				maior = num;
			}
		}
		
		float media = soma / 5;
		
		System.out.println("Coleção de números: " + numeros);
		System.out.println("Soma: " + soma);
		System.out.printf("Média: %.2f", media );
		System.out.println("\nMaior número: " + maior);
		
	}

}
