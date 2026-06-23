package atividade_pratica_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exec01 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        ArrayList<String> cores = new ArrayList<>();

        // Entrada das cores
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a " + i + "ª cor: ");
            cores.add(leia.nextLine());
        }

        // Listar as cores na ordem de inserção
        System.out.println("\nListar todas as cores:\n");

        for (String cor : cores) {
            System.out.println(cor);
        }

        // Ordenar em ordem crescente
        Collections.sort(cores);

        System.out.println("\nOrdenar as cores:\n");

        for (String cor : cores) {
            System.out.println(cor);
        }

        leia.close();
    }
		
		
	}


