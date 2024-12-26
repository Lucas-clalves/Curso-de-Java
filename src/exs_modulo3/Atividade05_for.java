package exs_modulo3;
import java.util.Scanner;
public class Atividade05_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Consumo médio do carro.");
        System.out.println("Informe o numero de viagens");

        int viagens = scanner.nextInt();

        int kM;
        int litros;
        double somaDaMedia = 0;

        for (int cont = 1; cont <= viagens; cont++) {
            System.out.println("Informe a quantidade de km da viagem.");
            kM = scanner.nextInt();

            System.out.println("Informe a quantidade de litros.");
            litros = scanner.nextInt();

            somaDaMedia = somaDaMedia + (double) kM /litros;
        }
        double consumoMedio = somaDaMedia/viagens;
        System.out.println("Consumo médio do carro é: " + consumoMedio);

    scanner.close();
    }
    }

