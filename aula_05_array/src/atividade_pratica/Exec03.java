package atividade_pratica;

public class Exec03 {

	public static void main(String[] args) {
		
		int somaPrincipal = 0;
		int somaSecundaria = 0;

		int matriz [] [] = {
				{1,2,3},
				{4,5,6}, 
				{7,8,9}
		};
		

		for(int i = 0; i < matriz.length; i++) {
		    System.out.println("Elementos da diagonal principal : " + matriz[i][i] + " ");
		}
		
		for(int i = 0; i < matriz.length; i++) {
		    System.out.println("Elementos da diagonal secundaria " + matriz[i][matriz.length - 1 - i] + " ");
		}
		
		for(int i = 0; i < matriz.length; i++) {

		    somaPrincipal += matriz[i][i];

		    somaSecundaria += matriz[i][matriz.length - 1 - i];
		}

		System.out.println("Soma dos Elementos da Diagonal Principal:");
		System.out.println(somaPrincipal);

		System.out.println("\nSoma dos Elementos da Diagonal Secundária:");
		System.out.println(somaSecundaria);
	}
}
