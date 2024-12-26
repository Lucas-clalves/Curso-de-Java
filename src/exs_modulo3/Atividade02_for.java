package exs_modulo3;
import java.util.Scanner;
public class Atividade02_for {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa de calculo da atividade 2 com estrutura for.");
        System.out.println("Escreva o numero que deseja calcular");

        int n = scanner.nextInt();
        int soma = 0;
        int somaQuadrada = 0;

        for(int cont = 1;cont<n;cont++){
            soma = soma + cont;
            somaQuadrada = somaQuadrada + cont*cont;
        }
        double media = (double) soma/n;

        System.out.printf("A soma é:%d%n"
                + "A soma quadrada é:%d%n",soma,somaQuadrada);
        System.out.println("A media é:"+media);

    scanner.close();




    }
}
