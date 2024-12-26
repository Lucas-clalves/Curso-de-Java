package exs_modulo3;

public class Atividade09 {
    public static void main(String[] args){
        System.out.println("Dez primeiros Fibonacci.");
        int n1 = 0;
        int n2 = 1;
        int result=1;
        int i = 0;

        while(i<10){
            i++;
            System.out.println("Fibonacci:"+result);
            result =n1+n2;
            n1= n2;
            n2= result;

        }
    }
}
