package Estrutura_Repetitiva;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		/*FAZER UM PROGRAMA QUE LÊ NÚMEROS E SOMA ESSES NÚMEROS
		 * O PROGRAMA SÓ PARA QUANDO EU DIGITAR 0, SE NÃO A SOMA CONTINUA
		 * ETERNAMENTE.*/
		
		Scanner sc = new Scanner (System.in);
		
		
		int numero;
		int soma = 0;
		
		
		
		System.out.print("DIGITE NUMEROS: ");
		numero = sc.nextInt();

		
		while(numero !=0) {
			soma+=numero;	
			numero = sc.nextInt();
		}
		System.out.printf("RESULTADO: %d ",soma);
		

		sc.close();
	}	
			 
			 	
}