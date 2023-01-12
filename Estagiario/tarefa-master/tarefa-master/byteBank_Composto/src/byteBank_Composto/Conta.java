 package byteBank_Composto;

public class Conta {
	// atributos
	private double saldo;
	int agencia;
	int numeroConta;
	Cliente titular;

	// metodos
	public void deposita(double valor) {// você ten que passar o valor, o tipo do valor que você esta passando e no jaa
										// é obroigatorio retornar algo nem q seja o oid onde não retornamos nada
		// this.saldo = this.saldo + valor;
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			// this.saldo = this.saldo - valor;
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}

	}

	public double getSaldo() {
		return this.saldo;
	}
}
