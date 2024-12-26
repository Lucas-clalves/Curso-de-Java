package exs_modulo3;
import java.util.Scanner;
public class Atividade02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Em qual mes você deve realizar a vistoria?");
        System.out.println("Informe a placa do seu carro:");
        int placa = scanner.nextInt();
        int resto = placa % 10;

        if(placa <= 9999){
            switch(resto){

                case 0: System.out.println("Você deve realizar a vistoria em janeiro");break;
                case 1: System.out.println("Você deve realizar a vistoria em fevereiro");break;
                case 2: System.out.println("Você deve realizar a vistoria em março");break;
                case 3: System.out.println("Você deve realizar a vistoria em abril");break;
                case 4: System.out.println("Você deve realizar a vistoria em maio");break;
                case 5: System.out.println("Você deve realizar a vistoria em junho");break;
                case 6: System.out.println("Você deve realizar a vistoria em setembro");break;
                case 7: System.out.println("Você deve realizar a vistoria em outubro");break;
                case 8: System.out.println("Você deve realizar a vistoria em novembro");break;
                case 9: System.out.println("Você deve realizar a vistoria em dezembro");break;
                default: System.out.println("Placa invalida");break;

            }
        }else{
            System.out.println("Placa invalida.");
        }


        scanner.close();

    }
}