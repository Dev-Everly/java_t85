package atividade_pratica_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Exec02 {
	public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(9);
        numeros.add(7);
        numeros.add(8);
        numeros.add(10);
        numeros.add(6);

        System.out.print("Digite o número que você deseja encontrar: ");
        int numero = leia.nextInt();

        int posicao = numeros.indexOf(numero);

        if (posicao != -1) {
            System.out.println("O número " + numero + " está localizado na posição: " + posicao);
        } else {
            System.out.println("O número " + numero + " não foi encontrado!");
        }

        leia.close();
    }
}
