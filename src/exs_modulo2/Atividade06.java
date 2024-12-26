package exs_modulo2;

import java.util.Scanner;

public class Atividade06 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Calculo de faturamento total mensal.");
		
		System.out.println("Informe o numero de mercadorias.");
		int nunDeMercadorias = scanner.nextInt();
		
		double fatMensal =0;
		double fatIndividual;
		int i = 0;
		
		while (i < nunDeMercadorias) {
		
			i=i+1;
			System.out.println("Escreva o nome da mercadoria.");
			String nome = scanner.next();
			System.out.println("Quanto custa "+nome+" ?");
			double quantoCusta = scanner.nextDouble();
			System.out.println("quantos(a) "+nome+" foram vendidos no mês?");
			int vendNoMes = scanner.nextInt();
			
			fatIndividual = quantoCusta*vendNoMes;
			System.out.printf("%s%s%s%.2f%n","A quantidade de ", nome ," vendidas por mês é:",fatIndividual);
			
			fatMensal= fatMensal+fatIndividual;
		}

		System.out.println("O faturamento mensal do armazem é: "+fatMensal);
		
		scanner.close();
}
}