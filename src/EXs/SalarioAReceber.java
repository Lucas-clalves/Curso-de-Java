package EXs;
import java.util.Scanner;

public class SalarioAReceber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Programa de cauculo de salario.");
		System.out.println("Informe o seu salário base.");
		double salarioBase = scanner.nextDouble();
		double gratificacao = salarioBase * 5/100;
		double imposto = salarioBase * 7/100;
		double salarioAReceber = salarioBase+gratificacao-imposto;
		
		System.out.printf("O salario a receber é de;%.2f%n",  salarioAReceber);
		
		
		scanner.close();
		
		

	}

}

/*Faça um programa que receba o salário base de um funcionário, calcule 
e mostre o salário a receber, sabendo-se que o funcionário tem 
gratificação de 5% sobre o salário base (que será acrescentado ao 
salário) e paga imposto de 7% sobre este salário (o que será 
descontado do salário).*/