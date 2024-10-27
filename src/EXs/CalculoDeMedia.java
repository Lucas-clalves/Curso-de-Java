package EXs;

import java.util.Scanner;

public class CalculoDeMedia {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("PROGRAMA CALCULO DE MEDIA.");
		
		System.out.println("Escreva a primeira nota.");
		double n1 = scanner.nextDouble();
		System.out.println("Escreva a segunda nota.");
		double n2 = scanner.nextDouble();
		System.out.println("Escreva a segunda nota.");
		double n3 = scanner.nextDouble();
		
		double resultado = (n1+n2+n3)/3;
		System.out.printf("Sua media é:%.2f%n", resultado);
		
		scanner.close();
		
	}

}
