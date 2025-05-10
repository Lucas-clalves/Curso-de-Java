package java3.src.exs_modulo1;
import java.util.Scanner;
public class HabitantesCidade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pesquisa dos habitantes de Alagaesia.");
        System.out.println("A coleta de dados encerra quando uma idade negativa for escrita.");

        System.out.println("informe a idade:");
        int idade = scan.nextInt();
        scan.nextLine();
        System.out.println("Sexo (M) para masculino e (f) para feminino");
        char sexo = scan.nextLine().charAt(0);
        System.out.println("Informe o salario");
        double salario = scan.nextDouble();
        double salarioTotal = 0;
        salarioTotal = salarioTotal + salario;

        int maiorIdade = idade;
        int menorIdade = idade;
        double menorSalario = 0;
        menorSalario = menorSalario + salario;
        int i = 0;
        int mulheresSalarioAte1500 = 0;
        int idadeMenorSalario = 0;
        char sexoMenorSalario = ' ';

        do {
            if (maiorIdade < idade)
                maiorIdade = idade;
            if (menorIdade > idade)
                menorIdade = idade;
            if (sexo == 'm' || sexo == 'M' && salario < 1500.00)
                mulheresSalarioAte1500++;
            if (menorSalario > salario) {
                menorSalario = salario;
                idadeMenorSalario = idade;
                sexoMenorSalario = sexo;
            }
            salarioTotal = salarioTotal + salario;
            i++;

            System.out.println("informe a idade:");
            idade = scan.nextInt();
            System.out.println("Sexo (M) para masculino e (f) para feminino");
            scan.nextLine();
            sexo = scan.nextLine().charAt(0);
            System.out.println("Informe o salario");
            salario = scan.nextDouble();
        } while (idade >= 0);

        double mediaSalarios = salarioTotal / i;
        System.out.println("A media de salarios do grupo é:"+mediaSalarios +" OU "+mediaSalarios+"*"+i);
        System.out.println("A maior idade do grupo foi "+maiorIdade+" anos, e a menor idade foi "+menorIdade+"anos.");
        System.out.println("O numero de mulheres com salario ate 1500,00 é de "+mulheresSalarioAte1500+" mulheres.");
        System.out.println("O sexo da pessoa com menor salario foi( "+sexoMenorSalario+" )"+" e a idade da pessoa com menor salario é "+idadeMenorSalario+" .");

        scan.close();


    }




    }

