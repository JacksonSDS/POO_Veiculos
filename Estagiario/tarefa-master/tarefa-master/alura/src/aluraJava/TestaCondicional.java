package aluraJava;

public class TestaCondicional {
	public static void main(String[] args) {
		int idade = 19;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("você tem mais de 18 anos");
			System.out.println("seja bem vindo(a)");
		}else if (quantidadePessoas >= 2) {
			System.out.println("você não tem 18, mas pode entrar,"
					+ "pois esta acompanhado");
		}else {
			System.out.println("infelizmente você nao pode entrar, pois nao tem 18 anos e nem esta acompanhado "
					+ "por duas ou mais pessoas");
			System.out.println("desculpa");
		}
	}
}
