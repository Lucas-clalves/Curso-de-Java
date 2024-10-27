package EXs;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Escreva o primeiro numero:");
		double n1 = scanner.nextDouble();
		
		System.out.println("Escreva o segundo numero: ");
		double n2 = scanner.nextDouble();
		
		double resultado = n1 / n2;
		
		System.out.println("O resultado da divisão de "+ n1 + " por " + n2 + " é:" + resultado);
		scanner.close();
		
	}

}