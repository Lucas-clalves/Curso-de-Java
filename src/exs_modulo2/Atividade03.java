package exs_modulo2;
import java.util.Scanner;
public class Atividade03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Programa de calculo de numeros quadrados");
		System.out.println("Para encerrar digite um valor negativo.");

		System.out.println("Escreva um numero:");
		int numero = scanner.nextInt();
		int numeroQuadrado;
		
		while(numero >=0) {
			numeroQuadrado = numero*numero;
			System.out.printf("%s%d%s%d%n","O valor quadrado de ",numero," é ", numeroQuadrado);
			
			System.out.println("Escreva próximo numero:");
			numero = scanner.nextInt();
		}
		System.out.println("Programa fechado, obrigado!");
	
	scanner.close();	
	}

}
