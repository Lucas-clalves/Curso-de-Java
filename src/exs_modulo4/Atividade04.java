package exs_modulo4;
import java.util.Scanner;
public class Atividade04 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("A formula de bhaskara é b² -4.a.c ");

        System.out.println("Informe o valor de b");
        int b = scan.nextInt();

        System.out.println("Informe o valor de a");
        int a = scan.nextInt();
        if( a==0){
            while(a ==0){
                System.out.println("O valor de 'a' n pode ser igual a '0'.");
                System.out.println("Tente mais uma vez");
                a = scan.nextInt();
            }
        }
        System.out.println("Informe o valor de c");
        int c = scan.nextInt();
        int d = -4;

        System.out.println("Substituindo temos: "+b+"² "+d+"."+a+"."+c);

        double b2 = Math.pow(b,2);
        double delta = (b2 -(4*a*c));

        System.out.println();
        System.out.println("Delta é igual a: "+delta);
        System.out.println();

        if(delta<0){
            System.out.println("O cálculo encerra aqui, pois para continuar, Δ (delta) não pode ser menor que 0.");
        }else{
            System.out.println("Agora vamos a segunda parte");
            System.out.println();


            double x1 = ((-(b) + (Math.sqrt(delta)))/(2*a));
            double x2 = ((-(b) - (Math.sqrt(delta)))/(2*a));
            System.out.println("O valor de x1 é; "+x1);
            System.out.println("O valor de x2 é: "+x2);

        }
        scan.close();
    }

}
