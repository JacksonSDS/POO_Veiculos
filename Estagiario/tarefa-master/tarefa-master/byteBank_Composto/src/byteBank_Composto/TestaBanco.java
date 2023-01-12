package byteBank_Composto;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente Jackson = new Cliente();
		Jackson.nome = "Jackson Sousa";
		Jackson.cpf = "222.222.222-22";
		Jackson.Profissao = "programador";
		
		Conta contaDoJackson = new Conta();
		contaDoJackson.deposita(100);
		
		//associa o cliente Jackson a conta contaDoJackson
		contaDoJackson.titular = Jackson;//fazendo uma associação atribuindo referencia pro atributo titular 
		
		System.out.println(contaDoJackson.titular.nome);
		}

}
