package exs_modulo3;

public class Atividade07_for {
    public static void main(String[] args) {
        System.out.println("calculo de valor quadrado de 15 a 200.");


        int quadrado;

        for(int cont=15;cont<=200;cont++) {
            quadrado = cont*cont;
            System.out.println("O quadrado de "+cont+" é "+quadrado);


        }
        System.out.println("Fim do programa.");

    }
}
