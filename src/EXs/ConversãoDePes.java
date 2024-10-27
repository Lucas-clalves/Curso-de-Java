package EXs;

import java.util.Scanner;

public class ConversãoDePes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Programa de conversão de pés para polegadas, jardas e milhas.");
		System.out.println("Escrava o valor em Pés");
		double pes = scanner.nextDouble();
		
		double polegada = pes*12;
		double jarda = pes/3;
		double milhas = pes/5280;
		
		System.out.printf("%.2f%s%n%n",pes," pés corresponde a:");
		System.out.printf("Polegadas:%f%n",polegada);
		System.out.printf("Jardas:%f%n",jarda);
		System.out.printf("Milhas:%f%n",milhas);
		
		scanner.close();
		
		
	}

}
