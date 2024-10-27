package exs_modulo2;
import java.util.Scanner;
public class Atividade04 {
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Media das idades informadas.");
		System.out.println("Digite 0 para encerrar o programa.");
		System.out.println("Escreva a primeira idade:");
		
		int idade = scanner.nextInt();
		int soma = 0;
		int i = 0;
		
		while(idade>0) {
			
			i = i+1;
			soma = soma + idade;
			System.out.println("Escreva proxima idade:");
			idade = scanner.nextInt();
			
			}
		
		double media = soma/i;
		
		System.out.printf("A media das idades é:%.2f",media);
		
	scanner.close();	
	}
	

}
