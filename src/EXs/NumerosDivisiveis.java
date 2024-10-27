package EXs;

import java.util.Scanner;

public class NumerosDivisiveis {
	
	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Os valores inteiros são divisiveis?");
		System.out.print("informe o primeiro numero:");
		int n1 = scanner.nextInt();
		System.out.print("informe o segundo numero:");
		int n2 = scanner.nextInt();
		System.out.print("informe o terceiro numero:");
		int n3 = scanner.nextInt();
		System.out.print("informe o quarto numero:");
		int n4 = scanner.nextInt();
		
		System.out.println("Os valores divisiveis por 2 e 3 são:");
		
		if (n1 % 2 == 0 && n1 % 3 == 0) {
			System.out.println( n1 );
		}if (n2 % 2 == 0 && n2 % 3 == 0) {
			System.out.println( n2 );
		}if (n3 % 2 == 0 && n3 % 3 == 0) {
			System.out.println( n3 );
		}if (n4 % 2 == 0 && n4 % 3 == 0) {
			System.out.println( n4 );
		}
		
		scanner.close();
	}

}
