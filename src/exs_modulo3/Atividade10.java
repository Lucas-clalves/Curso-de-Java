package exs_modulo3;
import java.util.Scanner;
public class Atividade10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu de opções:");
        System.out.println("1. Somar dois números.");
        System.out.println("2. Numero ao quadrado.");
        System.out.println("Digite a opção desejada.");

        int opcao = scanner.nextInt();

        switch(opcao){
            case 1:System.out.println("Escolha o primeiro numero q deseja somar:");
                int soma1 = scanner.nextInt();
                System.out.println("Escolha o segundo numero q deseja somar:");
                int soma2 = scanner.nextInt();
                int soma = soma1 + soma2;
                System.out.printf("%s%d%s%d%s%d%n","A soma entre ",soma1," e ",soma2," é: ",soma);break;
            case 2: System.out.println("Digite o numero desejado");
            int n1 = scanner.nextInt();
            int nunQuadrado = n1*n1;
                System.out.printf("%s%d%s%d%n","O valor quadrado de ",n1," é :", nunQuadrado);break;
            default:System.out.println("Opção inesistente.");break;
        }
        scanner.close();
    }
}
