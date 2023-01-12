package beeCrowd;

import java.util.Scanner;

public class Ex1075 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	int J = input.nextInt();
    	for (int i = 1; i < 1000; i++) {
    		if (i % J == 2) System.out.println(i);
    	}
    	
    	input.close();
	}	
}

