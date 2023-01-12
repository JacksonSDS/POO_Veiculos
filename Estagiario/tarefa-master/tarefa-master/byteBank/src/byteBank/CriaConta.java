package byteBank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("saldo dessa conta é " + primeiraConta.saldo);
		System.out.println("saldo dessa conta é " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numeroConta);
		
		System.out.println(segundaConta.agencia);
		
		if(primeiraConta == segundaConta) {//compara referencia não objeto
			System.out.println("sao a mesma conta");
		}else {
			System.out.println("nao sao a mesma conta");
			
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);//aqui imprimo e sai numeros diferentes porque nao to referenciando o mesmo onjeto cada uma ta referenciando objetos diferentes
		
		
	}

}
