package aula_06_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		Set<String> frutas = new HashSet<>(
			    Arrays.asList(
			        "Abacate",
			        "abacate",
			        "Morango",
			        "Abacate",
			        "Maçã",
			        "Laranja"
			    )
			);
		
		for(String fruta : frutas) {
			System.out.println(fruta);
			System.out.println(fruta.hashCode());
			}
		System.out.println("A fruta laranja está presente : " + frutas.contains("Laranja"));
		
		frutas.remove("Laranja");
		
		
	}

}
