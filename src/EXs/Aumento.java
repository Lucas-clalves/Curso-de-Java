package EXs;

import java.util.Scanner;

public class Aumento {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Programa de calculo de salario;");
		
		System.out.println("Escreva o seu salario atual:");
		double salarioBase = scanner.nextDouble();
		double salarioFinal = 0;
		
		if (salarioBase < 5000) {
			salarioFinal = ((salarioBase * 30) / 100) + salarioBase;
		}else {
			System.out.print("Você não esta apto para o aumento. ");
			}
		if (salarioFinal > 0) {
			System.out.printf("%s%.2f%n","o seu novo salario é de: ", salarioFinal);
			
		}
		
		scanner.close();
		
	}

}
