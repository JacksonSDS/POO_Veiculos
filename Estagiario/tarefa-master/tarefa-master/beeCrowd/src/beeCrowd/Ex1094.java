package beeCrowd;

import java.util.Scanner;

public class Ex1094 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N, X, total = 0, totalCoelhos = 0, totalRatos = 0, totalSapos = 0;
		float totalCoelhosPercentual = 0, totalRatosPercentual = 0, totalSaposPercentual = 0;
		String animal_cha;
		N = input.nextInt();
		for (int i = 1; i <= N; i++) {
			X = input.nextInt();
			animal_cha = input.next();
			total += X;
			if (animal_cha.equals("C")) {
				totalCoelhos+= X;
			}else if (animal_cha.equals("R")) {
				totalRatos += X;
			}else if (animal_cha.equals("S")) {
				totalSapos += X;
			}
			totalCoelhosPercentual = (float) ((totalCoelhos * 100.00) / total);
			totalRatosPercentual = (float) ((totalRatos * 100.00) / total);
			totalSaposPercentual = (float) ((totalSapos* 100.00) / total);

		}

		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + totalCoelhos);
		System.out.println("Total de ratos: " + totalRatos);
		System.out.println("Total de sapos: " + totalSapos);

		System.out.printf("Percentual de coelhos: %.2f\n", totalCoelhosPercentual);
		System.out.printf("Percentual de ratos: %.2f\n", totalRatosPercentual);
		System.out.printf("Percentual de sapos: %.2f\n", totalSaposPercentual);

	}
}
