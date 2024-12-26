package exs_modulo4;

public class Atividade02 {
    public static void main (String[] args){
        for(int i =0;i<=100;i++){

            String binario = Integer.toBinaryString(i);
            System.out.printf("O valor de %d%s%s%n",i," em binario é ", binario);

        }
    }
}
