package Estrutura_Sequencial;

import java.util.Scanner;

/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.*/

public class Exercicio1 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A,B,X;
		
		System.out.print("Digite Dois Números: ");
		A = sc.nextInt();
		B = sc.nextInt();
		X = A+B;
		
		System.out.printf("\nRESULTADO: %d",X);
		
		sc.close();
		
		
		
	}

}

