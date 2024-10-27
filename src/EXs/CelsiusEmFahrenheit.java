package EXs;

import java.util.Scanner;

public class CelsiusEmFahrenheit {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Programa de conversão de Celsius em Fahrenheit.");
		System.out.println("escreva a temperatura em celsios:");
		double celsius = scanner.nextDouble();
		double fahrenheit = (((9*celsius)/5)+32);
		
		System.out.printf("%.1f%s%.1f%s%n",celsius," graus celsius corresponde a ",fahrenheit," fahrenheit.");
		
		scanner.close();
		
	}

}
