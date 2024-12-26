package EXs;

import java.util.Scanner;

public class AreaDeUmTriangulo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Programa de calculo da área de um triângulo.");
		System.out.println("Informe a base do triangulo:");
		double base = scanner.nextDouble();

		System.out.println("Agora informe a altura:");
		double altura = scanner.nextDouble();
		
		double area = base * altura/2;
		
		System.out.printf("A área do triangulo é:%.3f%n", area);
		
		scanner.close();
		
		

	}

}
