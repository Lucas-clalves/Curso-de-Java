package EXs;

import java.util.Scanner;

public class CalculoDeDesconto {

	public static void main(String[] args) {
		
		/*Faça um programa que receba o preço de um produto, calcule e mostre 
o novo preço, sabendo-se que este sofreu um desconto de 10%. Por 
exemplo, se o produto custa R$ 100,00, o novo preço será 100 menos
10% de cem, que é 100 x 10 / 100. Essa conta é igual a 10, ficando o 
novo preço R$ 90,00*/
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Programa de calculo de desconto.");
		System.out.println("Informe o valor que deseja calcular:");
		double valororiginal = scanner.nextDouble();
		double valordodesc = valororiginal * 10/100;
		double novopreco = valororiginal - valordodesc;
		
		System.out.printf("O novo preço é de:%.2f%n", novopreco);
		
		scanner.close();
		
		
	}

}
