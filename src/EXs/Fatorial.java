package EXs;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Calculo fatorial.");
		System.out.print("Infirme o primeiro numero:");
		int numero = scanner.nextInt();
		int valor = 2;
		long fatorial = 1;
		
		
		while(valor <= numero) {
			fatorial = fatorial * valor;
			valor = valor+1;
			
		}
			
		System.out.printf("%s%d%s%d%n","O fatorial de ", numero," é:",fatorial);
		
		scanner.close();


	}

}
