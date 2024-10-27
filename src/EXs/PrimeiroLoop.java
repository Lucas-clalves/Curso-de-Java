package EXs;

import java.util.Scanner;

public class PrimeiroLoop {
    public static void main(String[] args) {
    
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Vamos calcular a media da turma." );
    	System.out.print("Quantos alunos tem?");
    	
    	int numeroDeAlunos = scanner.nextInt();
    	int numeroDeNotas = 0;
    	int soma = 0;
    	
    	while (numeroDeNotas < numeroDeAlunos) {
    		System.out.printf("%s%d%n","Numero de notas é: ",numeroDeNotas);
    		int nota = scanner.nextInt();
    		soma = soma + nota;
    		numeroDeNotas = numeroDeNotas +1;
    	}
    	double media = (double) soma / numeroDeAlunos;
    	
    	System.out.printf("%s%.1f%n","A media da turma é: ", media);
    	
    		scanner.close();	
    
    }
 


}