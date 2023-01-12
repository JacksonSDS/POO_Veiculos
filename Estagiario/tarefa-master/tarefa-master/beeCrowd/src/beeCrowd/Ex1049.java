package beeCrowd;

import java.util.Scanner;

public class Ex1049 {
	public static void main(String[] args) {
			String palavra1 , palavra2, palavra3;
		
	
			Scanner input = new Scanner(System.in);
			palavra1 = input.next();
			palavra2 = input.next();
			palavra3 = input.next();
			
			
			if (palavra1.equals("vertebrado") && palavra2.equals("ave") && palavra3.equals("carnivoro")) {
				System.out.println("aguia");
			}else if (palavra1.equals("vertebrado") && palavra2.equals("ave") && palavra3.equals("onivoro")) {
				System.out.println("pomba");
			}
			if (palavra1.equals("vertebrado") && palavra2.equals("mamifero") && palavra3.equals("onivoro")) {
				System.out.println("homem");
			}else if (palavra1.equals("vertebrado") && palavra2.equals("mamifero") && palavra3.equals("herbivoro")) {
				System.out.println("vaca");
			}
			
			if (palavra1.equals("invertebrado") && palavra2.equals("inseto") && palavra3.equals("hematofago")) {
				System.out.println("pulga");
			}else if (palavra1.equals("invertebrado") && palavra2.equals("inseto") && palavra3.equals("herbivoro")) {
				System.out.println("lagarta");
			}
			if (palavra1.equals("invertebrado") && palavra2.equals("anelideo") && palavra3.equals("hematofago")) {
				System.out.println("sanguessuga");
			}else if (palavra1.equals("invertebrado") && palavra2.equals("anelideo") && palavra3.equals("onivoro")) {
				System.out.println("minhoca");
			}
			input.close();
		}
	}

