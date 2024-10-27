package EXs;

import java.util.Scanner;

public class ValorDeFaixa {

	public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
		
		System.out.print("Escreva o numero:");
		int n1 = scanner.nextInt();
		
		
		
		
		if (n1 >= 1 && n1 <= 9) { 			
			System.out.println("O valor esta na faixa permtida.");
		} else {
			System.out.println("O valor está fora da faixa.");
		}
			
		scanner.close();
		}
		
	}


