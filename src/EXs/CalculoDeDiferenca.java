package EXs;

import java.util.Scanner;

public class CalculoDeDiferenca {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Programa de calculo de diferença de numeros inteiros.");
		System.out.print("Escreva o primeiro numero:");
		int n1 = scanner.nextInt();
		System.out.print("Escreva o segungo numero:");
		int n2 = scanner.nextInt();
		
		int diferenca;
		if (n1>n2) {
			diferenca = n1 - n2;
		}else if (n2>n1) {
			diferenca = n2 - n1;
		}else {
			diferenca = 0;
		}
		System.out.printf("%s%d%s%d%s%d%n","A diferença de ", n1, " e " ,n2, " é de:", diferenca);
		if (n1 == n2) {
			System.out.print("Os numeros são iguais, portanto, a diferença é de zero.");
			
		}
		
		scanner.close();
		
		

	}

}
