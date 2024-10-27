package EXs;

import java.util.Scanner;

public class CalculoDeSalarioFinal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	
		System.out.println("Vamos descobrir sua comição e seu salario final.");
		System.out.println("informe seu salario fixo:");
		double salarioFix = scanner.nextDouble();
		System.out.println("Agora o valor das suas vendas.");
		double valorDasVendas = scanner.nextDouble();
		
		double comicao = valorDasVendas * 4/100;
		double salarioFinal = salarioFix + comicao;
		
		System.out.println("Vamos ao resultado. :)");
		System.out.printf("o valor da comição é: R$ %.2f%n",comicao);
		System.out.printf("portanto o seu salario final é de: R$ %.2f%n", salarioFinal);
		
		scanner.close();
		
	}

}
