package beeCrowd;

import java.util.Scanner;

public class Ex1065 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x;
		int contador = 0;
		for (int i = 0; i < 5; i++) {
			x = input.nextInt();
			if (x / 2 == 0)
				contador++;
		}
		System.out.println(contador + " valores pares");
		
		input.close();
	}
}
