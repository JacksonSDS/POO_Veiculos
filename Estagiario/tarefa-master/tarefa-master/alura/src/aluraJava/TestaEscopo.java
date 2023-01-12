package aluraJava;

public class TestaEscopo {
	public static void main(String[] args) {
		int idade = 16;
		int quantidadePessoas = 1;
		//boolean acompanhado = quantidadePessoas >= 2;
		
		boolean acompanhado;
		
		if(quantidadePessoas >= 2) {
			acompanhado = true;
		}else {
			acompanhado = false;
		}
		
		System.out.println("valor de acompahado é " + acompanhado);
		
		if (idade >= 18 || acompanhado) {
			System.out.println("seja bem vindo(a)");
		}else {
			System.out.println("infelizmente você nao pode entrar, pois nao tem 18 anos e nem esta acompanhado "
					+ "por duas ou mais pessoas");
			System.out.println("desculpa");
		}
	}
}
