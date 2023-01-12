package beeCrowd;

import java.util.Scanner;

public class Ex1060 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int contador = 0;
        for (int i = 0; i < 6; i++) {
        	double n = input.nextDouble();
        	if (n > 0) contador++;
        }
        System.out.println(contador + " valores positivos");
        
        input.close();
    }
}
