package exercicios_aula02;

import java.util.Scanner;

public class Exec_01 {

	public static void main(String[] args) {
		
		 
		 
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o salário: ");
		double salario = leia.nextDouble();
		
		System.out.println("Digite o abono : ");
		double abono = leia.nextDouble();
		
		double novoSalario = salario + abono;
		
		System.out.printf("Novo Salário %.2f", novoSalario);
		
		
		
		
		
		leia.close();
 
	}

}
