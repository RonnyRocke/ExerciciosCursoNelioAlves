package Estrutura_Condicionais;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* Fazer um programa para ler um valor inteiro de 1 a 7 representando um
			dia da semana (sendo 1=domingo, 2=segunda, e assim por diante).
			Escrever na tela o dia da semana correspondente, conforme exemplos.
			Entrada Saída
			1 Dia da semana: domingo
			Entrada Saída
			4 Dia da semana: quarta
			Entrada Saída
			9 Dia da semana: valor inválido
		 * 
		 * */
		byte dia;
		

		System.out.print("DIGITE UM DIA DE 1 A 7: ");
		dia = sc.nextByte();
		
		switch(dia) {
		case 1:
			String dia1 = "DIA DA SEMANA: DOMINGO";
			System.out.println(dia1);
			break;
			
		case 2:
			String dia2 = "DIA DA SEMANA: SEGUNDA";
			System.out.println(dia2);
			break;
			
		case 3:
			String dia3 = "DIA DA SEMANA: TERÇA";
			System.out.println(dia3);
			break;

		case 4:
			String dia4 = "DIA DA SEMANA: QUARTA";
			System.out.println(dia4);
			break;

		case 5:
			String dia5 = "DIA DA SEMANA: QUINTA";
			System.out.println(dia5);
			break;
			
		case 6:
			String dia6 = "DIA DA SEMANA: SEXTA";
			System.out.println(dia6);
			break;
			
		case 7:
			String dia7 = "DIA DA SEMANA: SABADO";
			System.out.println(dia7);
			break;
			
		default:
			System.out.println("OPÇÃO INVALIDA");
			break;
		  
		}
		sc.close();

	}
	
	
}
