package Estrutura_Condicionais;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("DIGITE UM DIA DE 1 À 7: ");
		int dia = sc.nextInt();
		
		if(dia == 1) {
			String dia1 = "DOMINGO";
			System.out.printf("%nDIA DA SEMANA: %d ", dia1);
		}
		else if(dia ==2) {
			String dia2 = "SEGUNDA";
			System.out.printf("%nDIA DA SEMANA: %d ", dia2);	
		}
		else if(dia ==3) {
			String dia3 = "TERÇA";
			System.out.printf("%nDIA DA SEMANA: %d ", dia3);	
		}
		else if(dia ==4) {
			String dia4 = "QUARTA";
			System.out.printf("%nDIA DA SEMANA: %d ", dia4);	
		}
		else if(dia ==5) {
			String dia5 = "QUINTA";
			System.out.printf("%nDIA DA SEMANA: %d ", dia5);	
		}
		else if(dia ==6) {
			String dia6 = "SEXTA";
			System.out.printf("%nDIA DA SEMANA: %d ", dia6);	
		}
		else if(dia ==7) {
			String dia7 = "SABADO";
			System.out.printf("%nDIA DA SEMANA: %d ", dia7);	
		}
		else {
			System.out.println("OPÇÃO INVÁLIDA!");
		}

		sc.close();

	}

}
