package EXs;

import java.util.Scanner;

public class MediaUNI {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Programa de calculo de media.");
			System.out.print("Escreva nota da A1:");
			double a1 = scanner.nextDouble();
			System.out.print("Escreva nota da A2:");
			double a2 = scanner.nextDouble();
			System.out.print("Esccreva nota da A3:");
			double a3 = scanner.nextDouble();
					
			double A1 = (a1 *30)/100;
			double A2 = (a2 *30)/100;
			double A3 = (a3 *40)/100;
			double media = A1 + A2 + A3; 
			
			System.out.printf("%s%.1f%n","sua nota media é:", media);
			
			scanner.close();

	}

}
