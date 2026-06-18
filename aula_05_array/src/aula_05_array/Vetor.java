package aula_05_array;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//vetor inicializado
		int vetorInteiros[] = {10, 20, 70, 45, 78, 100};
	
		//vetor vazio
		float vetorReal [] = new float[5];
		
		//listar todos os dados do vetor de inteiros
		 for(int i = 0; i < vetorInteiros.length ; i++) {
			System.out.printf("Vetor Inteiros[%d] = %d\n", i , vetorInteiros[i]); }
		 
		 System.out.println("Tamanho do vetor de inteiros: " + vetorInteiros.length);
		 
		 //inserir dados no vetor de reais
		 for(int i = 0; i < vetorReal.length ; i++) {
				System.out.printf("Digite um valor real para a posição %d: \n", i );
				vetorReal[i] = leia.nextFloat();
		 }
		 //Ordenar em ordem crescente
		 Arrays.sort(vetorReal);
		 
		 //Arrays.binarySearch(vetor, posicao)); > sem valores repetior e precisa estar ordenado
		 
		
		 
		 //listar todos os dados de vetor de reais
		 for(int i = 0; i < vetorReal.length ; i++) {
				System.out.printf("Vetor Inteiros[%d] = %f\n", i , vetorReal[i]); }
			 
			 System.out.println("Tamanho do vetor de inteiros: " + vetorReal.length);
		/*
		 * for(int numeros : vetorInteiros)
		 *  { System.out.println(numeros); }
		 */
		 
		 leia.close();
	}

	}
