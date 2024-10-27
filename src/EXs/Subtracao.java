package EXs;

import java.util.Scanner;

public class Subtracao {

	public static void main(String[] args) {
			
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Escreva o primeiro numero:");
		double n1 = scanner.nextDouble();
		
		System.out.println("Escreva o segundo numero: ");
		double n2 = scanner.nextDouble();
		
		double resultado = n1 - n2;
		
		System.out.println("O resultado da subtração de "+ n1 + " e " + n2 + " é:" + resultado);
		
		scanner.close();
		
	}

}
