package EXs;

import java.util.Scanner;

public class MaiorNumeroInteiro {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vamos descobrir qual o maior numero inteiro");
		
		System.out.print("Informe o primeiro numero:");
		int n1 = scanner.nextInt();
		System.out.print("Informe o segundo numero:");
		int n2 = scanner.nextInt();
		System.out.print("Informe o terceiro numero:");
		int n3 = scanner.nextInt();
		
		int maior = n1;
		
		if (n2 > maior) {
			maior = n2;
		}if (n3 > maior) {
			maior = n3;
			
		}
		System.out.printf("%s%d%n","o maior numero informado é: ",maior);
		
		scanner.close();
	}

}
