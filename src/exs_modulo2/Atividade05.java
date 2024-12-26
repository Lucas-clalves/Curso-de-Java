package exs_modulo2;
import java.util.Scanner;
public class Atividade05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Consumo médio do carro.");
		
		System.out.println("Informe o numero de viagens");
		int viagens = scanner.nextInt();
		
		int kM;
		int litros;
		int i = 0;
		double somaDaMedia = 0;
		
		while(i<viagens) {
			System.out.println("Informe a quantidade de km da viagem.");
			kM = scanner.nextInt();
			
			System.out.println("Informe a quantidade de litros.");
			litros = scanner.nextInt();
			
			somaDaMedia = somaDaMedia + (double) kM /litros;
			i= i+1;
		}
		
		double consumoMedio = somaDaMedia/viagens;
		System.out.println("Consumo médio do carro é: " + consumoMedio);

	scanner.close();
	
	}

}
