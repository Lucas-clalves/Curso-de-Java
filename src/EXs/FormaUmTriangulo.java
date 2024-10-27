package EXs;

import java.util.Scanner;

public class FormaUmTriangulo {

	public static void main(String[] args) {
		
	 Scanner scanner = new Scanner(System.in);
		
	 System.out.print("escreva valor do primeiro lado:");
	 double A = scanner.nextDouble();
	 System.out.print("escreva valor do segundo lado:");
	 double B = scanner.nextDouble();
	 System.out.print("escreva o valor da base:");
	 double C = scanner.nextDouble();
	 
	 if (A+B >C && A+C > B && B+C > A) {
		 System.out.print("Os lados formam um triângulo.");
	 }else {
		 System.out.print("Os valores informados não podem formar um triângulo");
	 }
	 scanner.close();
	 

	}

}
