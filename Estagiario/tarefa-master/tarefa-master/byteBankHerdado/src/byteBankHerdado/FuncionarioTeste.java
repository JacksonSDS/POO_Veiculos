package byteBankHerdado;

public class FuncionarioTeste {

	private String nome;
	private String cpf;
	private double salario;
	private int tipo = 0;//0 - Funcionario comun, 1 - Gerente, 2 - Diretor
	private int senha;

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public double getBonificacao() {

		if (this.tipo == 0) {
			return this.salario * 0.1;//Funcionario comun
		} else if (this.tipo == 1) {
			return this.salario;//Gerente
		} else {
			return this.salario + 1000.00;//Diretor
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
}
