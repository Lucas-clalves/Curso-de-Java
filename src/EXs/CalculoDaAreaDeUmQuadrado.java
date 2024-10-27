package EXs;

import java.util.Scanner;

public class CalculoDaAreaDeUmQuadrado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Programa de calculo da area de um quadrado.");
		System.out.println("Informe o valor de um dos lados do quadrado:");
		double lado = scanner.nextDouble();
		double area = lado * lado;
		
		System.out.printf("A area do quadrado é:%.2f%n", area);
		
		scanner.close();
		
		

	}

}
