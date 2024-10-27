package EXs;

import java.util.Scanner;

public class OutroProgramaDeNota {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Programa de calculo de media.");
		System.out.print("Escreva a nota do trabalho de laboratorio:");
		double tL = scanner.nextDouble();
		System.out.print("Escreva a nota da avaiação semestral:");
		double aS = scanner.nextDouble();
		System.out.print("Esccreva nota do exame final:");
		double eF = scanner.nextDouble();
		
		double media = (tL*20/100) + (aS*30/100) + (eF*30/100);
		
		System.out.printf("%s%.1f%n","Sua media é:", media);
		
		if (media > 8 && media <= 10) {
			System.out.println("Sua nota final é: A ");
		}
		if (media > 7 && media <= 8) {
			System.out.println("Sua nota final é: B ");
		}
		if (media > 6 && media <= 7) {
			System.out.println("Sua nota final é: C ");
		}
		if (media > 5 && media <= 6) {
			System.out.println("Sua nota final é: D ");
		}
		if (media >= 0 && media <= 5) {
			System.out.println("Sua nota final é: E ");
		}
		 
		scanner.close();
	}

}
