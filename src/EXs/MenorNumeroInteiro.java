package EXs;

import java.util.Scanner;

public class MenorNumeroInteiro {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vamos descobrir qual o maior numero inteiro");
		
		System.out.print("Informe o primeiro numero:");
		int n1 = scanner.nextInt();
		System.out.print("Informe o segundo numero:");
		int n2 = scanner.nextInt();
		System.out.print("Informe o terceiro numero:");
		int n3 = scanner.nextInt();
	
		int menor = n1;
		
		if (n2 < menor) {
			menor = n2;
		}if (n3 < menor) {
			menor = n3;
			
		}
		System.out.printf("%s%d%n","o menor numero informado é: ",menor);
		
		scanner.close();
	}

}
