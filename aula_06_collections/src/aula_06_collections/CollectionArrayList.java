package aula_06_collections;

import java.util.ArrayList;
import java.util.Comparator;

public class CollectionArrayList {

	public static void main(String[] args) {
		 
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(10);
		numeros.add(7);
		numeros.add(8);
		numeros.add(5);
		numeros.add(2);
		
		for(int lista : numeros) {
			System.out.println(lista);
		}
		
		System.out.println("O objeto que está presente no índice 1: " + numeros.get(1)); //retorna valor
		System.out.println("O índice do objeto 1: " + numeros.indexOf(7)); //retorna indice
		
		numeros.set(1,8	); // (INDICE,VALOR) > altera o array
		
		numeros.remove(1);
		
		for(int lista : numeros) {
			System.out.println(lista);
		}
		
		//numeros.sort(null); //ordem crescente
		//numeros.sort(Comparator.reverseOrder()); // ordem descrecente
		
		for(int lista : numeros) {
			System.out.println(lista);
		}
		
	}

}
