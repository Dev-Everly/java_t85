package atividade_pratica_list;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exec03 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<>();

        System.out.println("Digite 10 números inteiros:");

        while (numeros.size() < 10) {
            System.out.print("Número: ");
            numeros.add(leia.nextInt());
        }

        System.out.println("\nListar dados do Set:");

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        leia.close();
    }
}
