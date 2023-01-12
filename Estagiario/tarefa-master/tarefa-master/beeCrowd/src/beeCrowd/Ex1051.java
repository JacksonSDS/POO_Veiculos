package beeCrowd;

import java.util.Scanner;

public class Ex1051 {
	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in);
		double salario = input.nextDouble();
		
        if (salario >= 0 && salario <= 2000) {
        	System.out.println("Isento");
        }else if (salario > 2000 && salario <= 3000) {
        	System.out.printf("R$ %.2f%n", (salario - 2000) * 0.08);
        }else if (salario > 3000 && salario <= 4500) {
        	System.out.printf("R$ %.2f%n", ((salario - 3000)  * 0.18) + 80);
        }else {
        	System.out.printf("R$ %.2f%n", ((salario - 4500) * 0.28) + 350);
        }
        input.close();
    }
}