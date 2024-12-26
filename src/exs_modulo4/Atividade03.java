package exs_modulo4;
import java.util.Scanner;
public class Atividade03 {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o numero binário desejado:");
        String numero = scan.next();

        double decimal = Integer.parseInt(numero,2);

        System.out.printf("O valor do numero binario %s%s%.2f%s%n",numero," em decimal é ",decimal,".");

        scan.close();

    }
}
