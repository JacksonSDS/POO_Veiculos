package beeCrowd;

import java.util.Scanner;

public class Ex1041 {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        double x = input.nextDouble();
	        double y = input.nextDouble();
	        if (x == 0 && y == 0) {
	            System.out.println("Origem");
	        }else if (x == 0) {
	            System.out.println("Eixo Y");
	        }else if (y == 0) {
	            System.out.println("Eixo X");
	        }else if (y > 0 && x > 0) {
	            System.out.println("Q1");
	        }else if (y > 0 && x < 0) {
	            System.out.println("Q2");
	        }else if (y < 0 && x < 0) {
	            System.out.println("Q3");
	        }else if (y < 0 && x > 0) {
	            System.out.println("Q4");
	        }
	        input.close();
	    }
	}

