package Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Leitura dos valores de A, B e C
		double A, B, C;
		System.out.print("Digite o valor de A: ");
		A = sc.nextDouble();
		System.out.print("Digite o valor de B: ");
		B = sc.nextDouble();
		System.out.print("Digite o valor de C: ");
		C = sc.nextDouble();

		// Constante de PI
		double pi = 3.14159;

		// a) Área do triângulo retângulo que tem A por base e C por altura
		double areaTriangulo = (A * C) / 2.0;

		// b) Área do círculo de raio C (pi = 3.14159)
		double areaCirculo = pi * Math.pow(C, 2);

		// c) Área do trapézio que tem A e B por bases e C por altura
		double areaTrapezio = ((A + B) * C) / 2.0;

		// d) Área do quadrado que tem lado B
		double areaQuadrado = Math.pow(B, 2);

		// e) Área do retângulo que tem lados A e B
		double areaRetangulo = A * B;

		// Exibição dos resultados
		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

		sc.close();
	}
}
