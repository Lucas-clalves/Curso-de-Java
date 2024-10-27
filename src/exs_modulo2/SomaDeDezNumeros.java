package exs_modulo2;

import java.util.Scanner;

public class SomaDeDezNumeros {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Soma de dez numeros.");
	
	int numerosContados = 0;
	double soma = 0;
	
	
	while(numerosContados <10) {
		numerosContados = numerosContados +1;
		System.out.printf("Escreva numero%d:", numerosContados);
		double numero = scanner.nextDouble();
		soma = soma+numero;
		System.out.printf("numeros contados:%d%n",numerosContados);
	}
	System.out.printf("%s%.2f%n","A soma dos numeros fornecidos é:", soma);
	
	scanner.close();

	}

}
