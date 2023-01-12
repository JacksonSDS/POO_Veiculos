package beeCrowd;

import java.util.Scanner;

public class Ex1064 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		int contador = 0;
        double media = 0;
        double x;
        
        for (int i = 0; i < 6; i++) {
        	x = input.nextDouble();
        	if (x > 0) {
        		contador++;
        		media += x;
        	}
        }
        
        media = media / contador;
        System.out.println(contador + " valores positivos");
        System.out.printf("%.1f", media);
        
        input.close();
    }
}

