package byteBank_Composto;

public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaJulia = new Conta();
		System.out.println(contaDaJulia.getSaldo());
		
		contaDaJulia.titular = new Cliente();
		
		contaDaJulia.titular.nome = "Julia";
		System.out.println(contaDaJulia.titular.nome);
		
	}
}
