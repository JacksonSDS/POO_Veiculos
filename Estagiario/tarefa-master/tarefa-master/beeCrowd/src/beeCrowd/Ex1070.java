package beeCrowd;

import java.util.Scanner;

public class Ex1070 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int cont = 0;
        while (cont < 6) {
        	if (x % 2 == 1) {
        		System.out.println(x);
        		cont++;
        	}
    		x++;
        }
        
        input.close();
    }
}
