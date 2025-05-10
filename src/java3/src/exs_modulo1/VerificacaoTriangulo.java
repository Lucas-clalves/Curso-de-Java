package java3.src.exs_modulo1;
import java.util.Scanner;
public class VerificacaoTriangulo {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Verificação de um triangulo");

        System.out.println("Informe o valor de A");
        double a = scan.nextDouble();
        System.out.println("Informe o valor de B");
        double b = scan.nextDouble();
        System.out.println("Informe o valor de C");
        double c =scan.nextDouble();

        if(a+b>c && a+c>b && b+c>a){

            if( a==b && b==c) {
                System.out.println("As medidas formam um triangulo equilatero.");

            }else if(a != b && a != c && b != c) {
                System.out.println("As medidas formam um triangulo escaleno.");
            }else  System.out.println("As medidas formam um triangulo isósceles.");


        }else System.out.println("As medidas não formam um triangulo.");

        scan.close();
    }

}
