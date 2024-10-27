package EXs;

import java.util.Scanner;

public class RepeticaoControladaPorFlag {
    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);
    	
    	int notasLidas= 0;
    	int soma = 0;
    	
    	System.out.printf("Nota 1: ");
    	
    	int nota = scanner.nextInt();
    	
    	
    	
    	while (nota>=0) {
    		soma = soma + nota;
    		notasLidas = notasLidas + 1;
    		System.out.printf("Nota %d:",notasLidas+1);
    		nota = scanner.nextInt();
    		
    	}
    	double media = (double) soma / notasLidas;
    	
    	System.out.printf("%s%.1f%n","A media da turma é: ", media);
    	
    	
    	scanner.close();
    
    }
 


}

