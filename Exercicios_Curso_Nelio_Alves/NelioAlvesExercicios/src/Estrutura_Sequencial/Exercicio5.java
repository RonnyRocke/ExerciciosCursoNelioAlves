package Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	/* Fazer um programa para ler o código de uma peça 1,
	 * o número de peças 1, o valor unitário de cada peça 1,
	 * o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
	 * Calcule e mostre o valor a ser pago.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo_peca1, numero_pecas1, codigo_peca2, numero_pecas2;
		double valor_peca1, valor_peca2;
		
		System.out.print("Digite o Código Da Peça1: ");
		codigo_peca1 = sc.nextInt();
		
		System.out.print("Digite Quantas Peças1 Tem: ");
		numero_pecas1 = sc.nextInt();
		
		System.out.print("Digite o Valor Da Peça1: ");
		valor_peca1 = sc.nextDouble();
		
		System.out.print("\nDigite o Código Da Peça2: ");
		codigo_peca2 = sc.nextInt();
		
		System.out.print("Digite Quantas Peças2 Tem: ");
		numero_pecas2 = sc.nextInt();
		
		System.out.print("Digite o Valor Da Peça2: ");
		valor_peca2 = sc.nextDouble();
		
		// Cálculo do valor total a ser pago
		double total_peca1 = numero_pecas1 * valor_peca1;
		double total_peca2 = numero_pecas2 * valor_peca2;
		double valor_total = total_peca1 + total_peca2;
		
		System.out.println("\n\t*************************");
		System.out.println("\tCÓDIGO PEÇA1: " + codigo_peca1);
		System.out.println("\tQUANTIDADE DE PEÇAS1: " + numero_pecas1);
		System.out.println("\tVALOR UNITÁRIO PECA1: " + valor_peca1);
		System.out.printf("\tVALOR TOTAL PEÇA1: U$ %.2f%n", total_peca1);
		System.out.println("\n\t--------------------------");
		System.out.println("\tCÓDIGO PEÇA2: " + codigo_peca2);
		System.out.println("\tQUANTIDADE DE PEÇAS2: " + numero_pecas2);
		System.out.println("\tVALOR UNITÁRIO PECA2: " + valor_peca2);
		System.out.printf("\tVALOR TOTAL PEÇA2: U$ %.2f%n", total_peca2);
		System.out.println("\n\t*************************");
		System.out.printf("\tVALOR TOTAL A SER PAGO: U$ %.2f%n", valor_total);

		sc.close();
	}
}
