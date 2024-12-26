package exs_modulo4;
import java.util.Scanner;

public class Atividade07 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro numero (x)");
        int x = scan.nextInt();
        System.out.println("Informe o segundo numero (y)");
        int y = scan.nextInt();


        System.out.println("Escolha uma opção");
        System.out.println("1-O primeiro número elevado ao segundo número.");
        System.out.println("2-Raiz quadrada de cada um dos números.");
        System.out.println("Raiz cúbica de cada um dos números.");

        int opcao = scan.nextInt();

        switch(opcao){
            case 1: double potencia = (Math.pow(x,y));
                System.out.println("o resultado é: "+potencia);break;
            case 2: double raizUm = (Math.sqrt(x));
                double raizDois = (Math.sqrt(y));
                System.out.printf("a raiz de x é %.2f",raizUm);
                System.out.printf("e a raiz de y é %.2f",raizDois); break;

            case 3: double cubicaUm = (Math.cbrt(x));
                System.out.printf("A raiz cubica de x é: %.2f",cubicaUm);
            double cubicaDois = (Math.cbrt(y));
                System.out.printf("A raiz cubica de y é: %.2f",cubicaDois);break;
            default: System.out.println("Opção invalida.");

        }
    }

}
