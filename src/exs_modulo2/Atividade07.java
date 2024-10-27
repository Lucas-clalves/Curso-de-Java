package exs_modulo2;

public class Atividade07 {

	public static void main(String[] args) {
		System.out.println("calculo de valor quadrado de 15 a 200.");
		
		int i = 15;
		int quadrado = 0;
		
		while(i<=200) {
			quadrado = i*i;
			System.out.println("O quadrado de "+i+" é "+quadrado);
			i = i+1;
			
		}
		System.out.println("Fim do programa.");

	}

}
