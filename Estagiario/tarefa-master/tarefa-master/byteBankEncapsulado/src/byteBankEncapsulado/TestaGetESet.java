package byteBankEncapsulado;

public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		System.out.println(conta.getnumeroConta());
		
		Cliente jackson = new Cliente();
		//conta.titular = jackson;
		
		jackson.setNome("jackson sousa");
		conta.setTitular(jackson);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		//agora em duas linhas
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		System.out.println(titularDaConta);
		System.out.println(jackson);
		System.out.println(conta.getTitular());

	}
}
