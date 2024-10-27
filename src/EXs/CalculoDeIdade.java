package EXs;

import java.util.Scanner;

public class CalculoDeIdade {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Procrama de conversão de idade.");
		
		System.out.println("Informe o ano de nascimento:");
		int	anoDeNascimento = scanner.nextInt();
		System.out.println("Informe o ano atual:");
		int anoAtual = scanner.nextInt();
		
		int idade = anoAtual - anoDeNascimento;
		
		int idadeEmMeses = (idade*12);
		int idadeEmDias = (idade*365);
		int idadeEmSemanas = (idade*52);
		
		System.out.println("Vamos aos resultados!");
		System.out.printf("A idade é:%d%n", idade);
		System.out.printf("%d%s%d%s%n",idade," anos é equivalente a ", idadeEmMeses, " meses.");
		System.out.printf("%d%s%d%s%n",idade,"anos é equivalente a ", idadeEmDias, " dias.");
		System.out.printf("%d%s%d%s%n",idade,"anos é equivalente a ", idadeEmSemanas, " semanas.");
		
		scanner.close();

	}

}
