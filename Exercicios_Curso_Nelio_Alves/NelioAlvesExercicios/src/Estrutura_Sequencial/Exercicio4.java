package Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
			/* Fazer um programa que leia o número de 
			 * um funcionário, seu número de horas trabalhadas, 
		 	* o valor que recebe por hora e calcula o salário
		 	*  desse funcionário. A seguir, mostre o 
		 	*  número e o salário do funcionário, com duas casas
			decimais.*/
		
		int numero_funcionario;
		double horas_trabalhadas, valor_por_hora, calcula_salario;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("DIGITE O NÚMERO DO FUNCIONÁRIO: ");
		numero_funcionario = sc.nextInt();
		
		System.out.print("DIGITE O VALOR DE HORAS TRABALHADAS: ");
		horas_trabalhadas = sc.nextDouble();
		
		System.out.print("DIGITE O VALOR QUE RECEBE POR HORA: ");
		valor_por_hora = sc.nextDouble();
		
		calcula_salario = valor_por_hora*horas_trabalhadas;
		
		System.out.println("\n\t---------------------");
		System.out.println("\tNÚMERO DO FUNCIONÁRIO: " + numero_funcionario);
		System.out.println("\tHORAS TRABALHADAS: " + horas_trabalhadas);
		System.out.println("\tVALOR POR HORA: " + valor_por_hora);
		System.out.printf("\tSalario: U$ %.4f", calcula_salario);
		System.out.println("\n\t---------------------");

		sc.close();
	}

}
