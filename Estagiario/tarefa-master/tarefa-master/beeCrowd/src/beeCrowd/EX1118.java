package beeCrowd;

import java.util.Scanner;

public class EX1118 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double nota1, nota2 = 1;

		nota1 = input.nextDouble();
		if (nota1 >= 10 && nota1 <= 0) {
			System.out.println("nota valida");
		} else {
			System.out.println("nota invalida");
		}
		
		System.out.println("novo calculo (1-sim 2-nao)");

		nota2 = input.nextDouble();
		if (nota2 >= 10 && nota2 <= 0) {
			System.out.println("nota valida");
		} else {
			System.out.println("nota invalida");
		}
		
		double media = (nota1 + nota2) / 2;
		System.out.printf("media = %.2f\n", media);
	}
}
