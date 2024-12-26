package exs_modulo2;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Programa de calculo da atividade 2.");
		System.out.println("Escreva o numero que deseja calcular");
		
		int n = scanner.nextInt();
		int soma = 0;
		int somaQuadrada = 0;
		int i = 1;
		
	while (i <= n ) {
		
		soma = soma + i;
		somaQuadrada = somaQuadrada + i*i;
		i = i+1;
		}
		double media = (double) soma/n;
		
		System.out.printf("A soma é:%d%n"
				+ "A soma quadrada é:%d%n",soma,somaQuadrada);
		System.out.println("A media é:"+media);
	
	scanner.close();	
	
	}

}
