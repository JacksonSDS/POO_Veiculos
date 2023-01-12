package br.com.magna.sistemas.veiculos.modelo;

public class TracaoAnimal extends Veiculos {
	
	private int QuantidadeAnimal;
	private String TipoAnimal;

	public int getQuantidadeAnimal() {
		return QuantidadeAnimal;
	}
	public void setQuantidadeAnimal(int quantidadeAnimal) {
		QuantidadeAnimal = quantidadeAnimal;
	}
	public String getTipoAnimal() {
		return TipoAnimal;
	}
	public void setTipoAnimal(String tipoAnimal) {
		TipoAnimal = tipoAnimal;
	}
	
	public String puxarCorda() {
        return "Você esta puxando a corda do seu veiculo ";
    }
	
	public String guiar() {
        return "Você esta guiando seu veiculo";
    }


}
