package exec_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio02 {
	/*
	 * Cadastro de Alunos Crie um algoritmo que simule um cadastro simples de
	 * alunos: Utilize uma coleção para armazenar os alunos. Cada aluno deve ser
	 * representado da seguinte forma: Nome Idade Nota final Crie as funcionalidades
	 * para: Adicionar um aluno a uma coleção Listar todos os alunos cadastrados
	 * Calcular a média geral das notas Utilize loops para percorrer a coleção de
	 * alunos.
	 */


	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		List<Aluno> alunos = new ArrayList<>();

		int opcao;

		do {

		    System.out.println("""
		        ===== MENU =====
		        1 - Cadastrar aluno
		        2 - Listar alunos
		        3 - Média geral
		        0 - Sair
		    """);

		    opcao = leia.nextInt();
		    leia.nextLine(); 

		    switch (opcao) {

		        case 1:
		            System.out.println("Digite o nome:");
		            String nome = leia.nextLine();

		            System.out.println("Digite a idade:");
		            int idade = leia.nextInt();

		            System.out.println("Digite a nota:");
		            double nota = leia.nextDouble();

		            Aluno aluno = new Aluno(nome, idade, nota);
		            alunos.add(aluno);

		            System.out.println("Aluno cadastrado!");
		            break;

		        case 2:
		            for (Aluno a : alunos) {
		                System.out.println("Nome: " + a.getNome());
		                System.out.println("Idade: " + a.getIdade());
		                System.out.println("Nota: " + a.getNotaFinal());
		                System.out.println("----------------");
		            }
		            break;

		        case 3:
		            double soma = 0;

		            for (Aluno a : alunos) {
		                soma += a.getNotaFinal();
		            }

		            if (alunos.size() > 0) {
		                double media = soma / alunos.size();
		                System.out.println("Média geral: " + media);
		            } else {
		                System.out.println("Nenhum aluno cadastrado.");
		            }
		            break;

		        case 0:
		            System.out.println("Saindo...");
		            break;

		        default:
		            System.out.println("Opção inválida!");
		    }

		} while (opcao != 0);
	}
}

