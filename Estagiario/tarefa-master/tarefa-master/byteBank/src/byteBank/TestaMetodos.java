package byteBank;

public class TestaMetodos {
	public static void main(String[] args) {
		Conta contaDoJackson = new Conta();
		contaDoJackson.saldo = 300;
		contaDoJackson.deposita(50);
		System.out.println(contaDoJackson.saldo);
		//contaDoJackson.saca(20);
		boolean conseguiuRetirar = contaDoJackson.saca(20);
		System.out.println(contaDoJackson.saldo);
		System.out.println(conseguiuRetirar);//retorno do metodo fica a meu criterio se eu quero usar ou não quero usar aquela informação que foi devolvida
		
		Conta contaDaJulia = new Conta();
		contaDaJulia.deposita(1000);
		
		if(contaDaJulia.transfere(300, contaDoJackson)) {
			System.out.println("transferencia com sucesso");
		}else {
			System.out.println("faltou dinheiro");
		}
		System.out.println(contaDaJulia.saldo);
		System.out.println(contaDoJackson.saldo);
		
		
		contaDoJackson.titular = "Jackson Sousa";
		System.out.println(contaDoJackson.titular);
		}

}



//invocação de atributos =
//invocacção de metodos()