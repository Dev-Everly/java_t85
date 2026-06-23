package exec_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao ;
		
		List<Produto> produtos = new ArrayList();
		
		do {
			System.out.println("""
					===========Escolha uma Opção===========
					1 - Adicionar
					2 - Atualizar
					3 - Visualizar lista
					0 - sair
					""");
			
			opcao = leia.nextInt();
			leia.nextLine();
			
			switch(opcao) {
			
			case 1 :
				System.out.println("Nome do Produto: ");
				String nome = leia.nextLine();
				
				System.out.println("Quantidade: ");
				int quantidade = leia.nextInt();
				
				Produto produto = new Produto(nome, quantidade);
				
				produtos.add(produto);
				
				System.out.println("Produto adicionado com Sucesso !");
				break;
			case 2:
				System.out.println("Digite o nome do produto:");
				String nomeP = leia.nextLine();

				System.out.println("Digite a nova quantidade:");
				int novaQuantidade = leia.nextInt();

				boolean encontrado = false;

				for (Produto lista : produtos) {

				    if (lista.getNome().equalsIgnoreCase(nomeP)) {

				        lista.setQuantidade(novaQuantidade);
				        encontrado = true;

				        System.out.println("Produto atualizado!");
				        break;
				    }
				}

				if (!encontrado) {
				    System.out.println("Produto não encontrado.");
				} 
				break;
			case 3: 
				for(Produto p : produtos) {
					System.out.println("---------------------------");
					System.out.println("Produto: " +  p.getNome());
					System.out.println("Quantidade : " + p.quantidade);
					System.out.println("---------------------------");
				}
				break;
				default: System.out.println("Opção Inválida!");
				 
			}
		}while(opcao !=0);
		
		 
	}

}
