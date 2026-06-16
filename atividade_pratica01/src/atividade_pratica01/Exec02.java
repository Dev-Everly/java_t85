package atividade_pratica01;

import java.util.Scanner;

public class Exec02 {
	
	/*
	 * Regras: Nota maior ou igual a 7 → Aprovado Nota maior ou igual a 5 e menor
	 * que 7 → Recuperação Nota menor que 5 → Reprovado
	 */


	public static void main(String[] args) {
	 
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu Nome: ");
		String nome = leia.nextLine();
		
		System.out.println("Digite sua Nota: ");
		float nota = leia.nextFloat();
		
		if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida!");
		} else if(nota >= 7) {
			System.out.println("Você foi Aprovada! ");
		}else if (nota >= 5 && nota < 7) {
			System.out.println("Você está de Recuperação!");
		} else {
			System.out.println("Você foi Reprovado !");
		}
		
		leia.close();

	}

}
