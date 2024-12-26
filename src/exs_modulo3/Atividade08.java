package exs_modulo3;
import java.util.Scanner;
public class Atividade08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a senha");
        int senha = scanner.nextInt();
        int i = 1;

        if(senha<=9999 && senha >=1000) {
            while (senha != 1234) {
                i++;

                System.out.println("Senha incorreta.");
                System.out.println("Tentativa " + i);
                System.out.println("Informe a senha:");

                senha = scanner.nextInt();

            }
        }else{
            System.out.println("Quantidade de caracteres invalida.");
        }
        if(senha == 1234) {
            System.out.println("Senha correta, assess open.");
        }
        scanner.close();

    }
}
