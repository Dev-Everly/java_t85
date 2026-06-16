package atividade_pratica01;

import java.util.Scanner;

public class Exec01 {
	
	/* REGRAS
	 * Se a idade for maior ou igual a 18, o acesso deve ser liberado. Se a idade
	 * for menor que 18 e possuir autorização, o acesso deve ser liberado com
	 * autorização. Caso contrário, o acesso deve ser negado.
	 */


	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		char permissao;
		
		System.out.println("Digite o Nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a Idade: ");
		idade = leia.nextInt();
		
		System.out.println("Possui Autorização: (S/N) ");
		permissao = leia.next().toUpperCase().charAt(0);
		
		if (idade >= 18) {
			System.out.println("Acesso liberado  " + nome);
		} else if (permissao == 'S'){
			System.out.println("Acesso liberado com autorização " + nome);
		}else {
			System.out.println("Acesso negado para " + nome);
		}
		
		
		
		leia.close();
	}

}
