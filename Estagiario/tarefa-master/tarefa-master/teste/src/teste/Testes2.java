package teste;

import java.util.*;

public class Testes2 {
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Jackson");
		nomes.add("Joao");
		
		System.out.println(nomes.contains("Jackson"));//existe Jackson dentro do meu arrayList ele consegue identificar
		System.out.println(nomes.contains("Jackso"));//não existe Jackso dentro do meu arrayList por isso retorna false
		
		boolean removido = nomes.remove("Jackson");
		
		System.out.println(removido);//identificou que foi removido
		System.out.println(nomes.contains("Jackson"));// indetifcou que não existe mais no meu arrayList 
		
		
		System.out.println(nomes.size());//para ver o tamanho do array list usa o size
		
		String[] nomesArray = nomes.toArray(new String[nomes.size()]);
		
		
	}

}
