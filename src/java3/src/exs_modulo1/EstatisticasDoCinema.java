package java3.src.exs_modulo1;
import java.util.Scanner;
public class EstatisticasDoCinema {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Se possivel informe sua idade e sua opinião em relação ao filme, segundo as seguintes notas:");
        System.out.println("Nota                      Significado");
        System.out.println("A                             Ótimo");
        System.out.println("B                             Bom");
        System.out.println("C                             Regular");
        System.out.println("D                             Ruim");
        System.out.println("E                             Péssimo");

        System.out.println("E digite F quando for o ultimo logo após sua resposta.");

        int cont=0, somaIdades=0,resOtimo=0,resRuim=0,resPessimo=0, maiorIdade = -1, numPessoas = 0;
        char nota=' ';

       do{
            cont++;
            System.out.printf("--- ESPECTADOR %03d ---", cont);

            System.out.printf("Idade: ");
            int idade = scan.nextInt();

            System.out.printf("Nota: ");
            nota = scan.nextLine().charAt(0);


        }while(nota != 'f'|nota != 'F');



    }
}
