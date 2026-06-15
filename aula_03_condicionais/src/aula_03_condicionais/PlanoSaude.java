package aula_03_condicionais;

import java.util.Scanner;

public class PlanoSaude {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		//int idade = 0;
		
		System.out.println("Digite a sua idade: ");
		int idade = leia.nextInt();
		
		if(idade > 0 && idade <= 10) {
			System.out.println("A mensalidade do plano é R$ 100,00");
		}else if(idade >= 11 && idade <= 29) {
			System.out.println("A mensalidade do plano é R$ 200,00");
		}else if (idade >= 30 && idade <= 45) {
			System.out.println("A mensalidade do plano é R$ 300,00");
		}else if (idade >= 46 && idade <= 59) {
			System.out.println("A mensalidade do plano é R$ 500,00");
		}else if (idade >= 60 && idade <= 65) {
			System.out.println("A mensalidade do plano é R$ 600,00");
		}else {
			System.out.println("A mensalidade é R$ 1000,00");
		}


		leia.close();
	}

}
