package byteBank;

public class TesteReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("saldo da primeira : " + primeiraConta.saldo);

		Conta segundaConta = primeiraConta;
		System.out.println("saldo da segunda conta é: " + segundaConta.saldo);

		segundaConta.saldo += 100;
		System.out.println("saldo da segunda conta é: " + segundaConta.saldo);

		System.out.println(primeiraConta.saldo);

		if (primeiraConta == segundaConta) {
			System.out.println("sao a mesma conta");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);//sao duas referencias pro mesmo objeto por isso quando eu imprimo sai os mesmo numeros

	}
}
