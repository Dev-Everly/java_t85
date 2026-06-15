package aula_03_condicionais;

import java.util.Scanner;

public class CondicionalEncadeado {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//float media = 0.0f;
		
		System.out.println("Digite a primeira nota: ");
		float n1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
 		float n2 = leia.nextFloat();
 		
 		float media = (n1 + n2)/ 2;
 		
 		if(media >= 6 ) {
 			System.out.println("Parabéns você foi aprovado!");
 		} else if  (media == 5) {
 			System.out.println("Você está de exame !");
 		}else {
 			System.out.println("Aluno reprovado! ");
 		}
		
		
		
		leia.close();
	}

}
