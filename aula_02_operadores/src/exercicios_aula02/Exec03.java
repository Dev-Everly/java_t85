package exercicios_aula02;

import java.util.Scanner;

public class Exec03 {
	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o Salário Bruto: ");
		float salarioBruto = leia.nextFloat();
		
		System.out.println("Informe o adicional noturno: ");
		float adicionalNoturno = leia.nextFloat();
		
		System.out.println("Informe Horas extras: ");
		float horasExtras = leia.nextFloat();
		
		System.out.println("Informe os descontos: ");
		float descontos = leia.nextFloat();
		
		float salarioLiquido = salarioBruto + adicionalNoturno + ( horasExtras * 5 ) - descontos;
		
		System.out.printf("Salário Líquido: %.2f", salarioLiquido);
				
		
		leia.close();
		
		
		
	}
}
