package exs_modulo3;
import java.util.Scanner;
public class Atividade01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua data de nasciment.o");
        System.out.println("Primeiro o dia:");
        int dia = scanner.nextInt();
        System.out.println("Agora o mês:");
        int mesNum = scanner.nextInt();
        String mes = "";


        switch(mesNum){
            case 1: mes = "Janeiro";break;
            case 2: mes = "Fevereiro";break;
            case 3: mes = "Março";break;
            case 4: mes = "Abril";break;
            case 5: mes = "Maio";break;
            case 6: mes = "Junho";break;
            case 7: mes = "Julho";break;
            case 8: mes = "Agosto";break;
            case 9: mes = "Setembro";break;
            case 10: mes = "Outubro";break;
            case 11: mes = "Novembro";break;
            case 12: mes = "Dezembro";break;
            default: System.out.println("Numero invalido!");
        }
        System.out.println("Agora o ano:");
        int ano = scanner.nextInt();

        System.out.println("dia "+dia+" de "+mes+" de "+ano);
        scanner.close();

    }
}
