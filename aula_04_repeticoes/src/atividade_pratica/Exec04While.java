package atividade_pratica;

import java.util.Scanner;

public class Exec04While {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade =0, identidadeGenero = 0,pessoaDev = 0,totalPessoas = 0 , contadorDev = 0, contadorCis_front = 0,
				contaodorCis_masc = 0, contadorBi_full =0, somaIdades = 0;
		float  mediaIdades = 0;
		char continua = 'S';
		
		
		
		while(continua != 'N') {
			System.out.println("Qual a idade: ");
			idade = leia.nextInt();
			
			System.out.println(""" 
					=== Qual sua identidade de genêro ===
					1 – Mulher Cis
					2 – Homem Cis
					3 – Não Binário
					4 – Mulher Trans
					5 – Homem Trans
					6 – Outros

					""");
			
			identidadeGenero = leia.nextInt();
			
			System.out.println("""
					=== Qual sua área de desenvolvimento ===
					1 – Backend
					2 – Frontend
					3 – Mobile
					4 – FullStack

					""");
			pessoaDev = leia.nextInt();
			System.out.println("Deseja continuar ? S/N");
			continua = leia.next().toUpperCase().charAt(0);
			
			totalPessoas++;
			somaIdades += idade;
			mediaIdades = (float) somaIdades / totalPessoas;
			 
			 if(pessoaDev == 1) {
					
					contadorDev++;
				} else if((identidadeGenero == 1 || identidadeGenero == 4) && pessoaDev == 2){
					 
					contadorCis_front++;
				}else if((identidadeGenero == 2 || identidadeGenero ==5 )&&  idade > 40) {
				 
					contaodorCis_masc++;
				}else if((identidadeGenero == 3 && pessoaDev == 4) && idade < 30) {
					contadorBi_full++;
				}
			
		
		}
		
	
		
	 
		System.out.println("Total de pessoas desenvolvedoras Backend: " + contadorDev);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend : " + contadorCis_front);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos : " +  contaodorCis_masc);
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos : " + contadorBi_full );
		
		
		System.out.println("O número total de pessoas que responderam à pesquisa : " + totalPessoas);
		System.out.println("A média de idade das pessoas que responderam à pesquisa : " + mediaIdades);
		leia.close();
	}

}
