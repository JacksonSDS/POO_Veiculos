package beeCrowd;

import java.util.Scanner;

public class Ex1043 {
	public static void main(String[] args) {
			double A, B, C, areaTrapezio, perimetroTriangle ;
		
		Scanner input =new Scanner(System.in);
		
		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();
		
		if ((A < (B+C)) && (B < (A+C)) && (C < (B+A))) {
			perimetroTriangle = A + B + C;
			System.out.printf("Perimetro = %.1f\n",perimetroTriangle);
		}else {
			areaTrapezio = ((A + B) * C) / 2;
			System.out.printf("Area = %.1f\n",areaTrapezio);
			}
		input.close();
	}

}
