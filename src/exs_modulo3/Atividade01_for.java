package exs_modulo3;
import java.util.Scanner;
public class Atividade01_for {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int soma =0;

    for(int cont=1; cont<=10;cont++){
        System.out.printf("Escreva o numero %d:",cont);
        int numero = scanner.nextInt();
        soma += numero;
        }
        System.out.printf("A soma dos numeros fornecidos é:%d",soma);
    scanner.close();

    }

}
