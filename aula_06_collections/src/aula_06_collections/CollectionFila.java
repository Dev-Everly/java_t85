package aula_06_collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CollectionFila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>(Arrays.asList(
				"Thiago", 
				"Guilherme",
				"Higor",
				"Sara",
				"Bella"));
		
		for(var cliente : fila) {
			System.out.println(cliente);
		}
		
	}

}
