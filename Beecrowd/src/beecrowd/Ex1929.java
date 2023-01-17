package beecrowd;

import java.util.Scanner;

public class Ex1929 {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	int A = input.nextInt();
	int B = input.nextInt();
	int C;
	if (A == B) {
		C = A;
	}else if (A > B) {
		C = A;
	}else C = B;
	System.out.println(C);
}

}
