package byteBankHerdado;

public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Autenticavel fa) {
		boolean autentificou = fa.autentica(this.senha);
		if(autentificou) {
			System.out.println("pode entrar no sistema");
		}else {
			System.out.println("nao pode entrar no sistema");
		}
	}

}
