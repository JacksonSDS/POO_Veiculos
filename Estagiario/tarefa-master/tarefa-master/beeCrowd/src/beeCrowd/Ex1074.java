package beeCrowd;

import java.util.Scanner;

public class Ex1074 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int X, j;   
        X = input.nextInt();
        for (int i = 1; i <= X; i++) {
            j = input.nextInt();
            if (j == 0) {
                System.out.println("NULL");               
            }else if(j % 2 != 0 && j < 0){
                System.out.print("ODD NEGATIVE\n");               
            }else if(j % 2 != 0 && j > 0){
                System.out.print("ODD POSITIVE\n");
            }else if(j % 2 == 0 && j  > 0){
                System.out.print("EVEN POSITIVE\n");
            }else{
                System.out.print("EVEN NEGATIVE\n");
            }
        }
        input.close();
    }
}