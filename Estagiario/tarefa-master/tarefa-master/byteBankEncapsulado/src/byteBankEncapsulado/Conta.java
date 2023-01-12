package byteBankEncapsulado;

public class Conta {
	// atributos
	private double saldo;
	private int agencia;
	private int numeroConta;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("o total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numeroConta = numero;
		System.out.println("estou criando uma conta " + this.numeroConta);
	}
	

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
	
	public int getnumeroConta() {
		return this.numeroConta;
	}
	
	public void setNumeroConta(int numeroConta) {
		if(numeroConta <= 0) {
			System.out.println("nao pode valor menor igual a 0");
			return;
		}
		this.numeroConta = numeroConta;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	public static int getTotal() {
		return Conta.total;
	}
}
