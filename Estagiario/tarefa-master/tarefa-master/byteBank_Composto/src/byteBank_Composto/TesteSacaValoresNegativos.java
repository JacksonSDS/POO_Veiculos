package byteBank_Composto;

public class TesteSacaValoresNegativos {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		/*System.out.println(conta.saca(101));//vai retornar 100 ele nao vai sacar porque devolveu boolean false 
		System.out.println(conta.saldo);
		
		conta.saldo = conta.saldo - 101;
		System.out.println(conta.saldo);*/
		
		System.out.println(conta.saca(101));
		
		conta.saca(101);
		System.out.println(conta.getSaldo());
	
	}
}
