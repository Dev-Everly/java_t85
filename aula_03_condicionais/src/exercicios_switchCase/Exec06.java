package exercicios_switchCase;

import java.util.Scanner;

public class Exec06 {
	/*
	 * Com base na tabela abaixo, escreva um algoritmo em Java que leia o Nome do
	 * Colaborador (String), o Código do Cargo do Colaborador (número inteiro de 1 a
	 * 6) e o Salário (número float)
	 */
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int percentual = 0;
		
		System.out.println("Nome do Colaborador: ");
		String nome = leia.nextLine();
		
		System.out.println("Cargo");
		int cargo = leia.nextInt();
		
		System.out.println("Salário: ");
		float salario = leia.nextFloat();
		
		switch (cargo) {
		case 1 :
			System.out.println("Cargo : Gerente");
			  percentual = 10;
			  break;
		case 2 :
			System.out.println("Cargo : Vendedor");
			percentual = 7;
			  break;
		case 3 :
			System.out.println("Cargo : Supervisor");
			percentual = 9;
			  break;	  
		case 4 :
			System.out.println("Cargo : Motorista");
			percentual = 6;
			  break;	
		case 5 :
			System.out.println("Cargo : Estoquista");
			percentual = 5;
			  break;
		case 6 :
			System.out.println("Cargo : Técnico de TI");
			percentual = 8;
			  break;	  
			  
		default: 
			System.out.println("Códido Inválido!");
		}
		
		double novo_salario = salario + (percentual / 100.0  ) * salario;
		
		System.out.println("Nome do colaborador: " + nome);
		System.out.println("Novo salário: R$ " + novo_salario);
		
		
		leia.close();
	}

}
