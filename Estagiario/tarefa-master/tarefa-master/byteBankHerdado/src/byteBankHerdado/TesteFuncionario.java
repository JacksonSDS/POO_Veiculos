package byteBankHerdado;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario jackson = new Gerente();
			jackson.setNome("Jackson Sousa");
			jackson.setCpf("232355609-1");
			jackson.setSalario(1700.00);
			
			System.out.println(jackson.getNome());
			System.out.println(jackson.getBonificacao());
			
			//jackson.salario = 1100.0;
		
	}
}
