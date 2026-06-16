
package atividade_pratica01;

import java.util.Scanner;

public class Exec03 {
	
	/*
	 * Regras: Utilize a estrutura de decisão para identificar a operação escolhida.
	 * Utilize operadores aritméticos para realizar o cálculo. Antes de realizar a
	 * divisão, verifique se o segundo número é diferente de zero. Caso o código da
	 * operação seja inválido, exiba uma mensagem de erro.
	 */


	public static void main(String[] args) {


        Scanner leia = new Scanner(System.in);

        System.out.println("\nCódigo da operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        System.out.print("Digite o código da operação: ");
        int operacao = leia.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = leia.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = leia.nextDouble();

        switch (operacao) {

            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;

            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;

            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;

            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Erro: divisão por zero não é permitida!");
                }
                break;

            default:
                System.out.println("Erro: código de operação inválido!");
        }

        leia.close();
    }

}
