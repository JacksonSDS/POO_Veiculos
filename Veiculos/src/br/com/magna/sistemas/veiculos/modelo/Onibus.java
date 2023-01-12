package br.com.magna.sistemas.veiculos.modelo;

public class Onibus implements Passageiro {
	
	public int MostrarCapacidadeDePassageiro = 75;
	
	@Override
	public int MostrarCapacidadeDePassageiro() {
		return MostrarCapacidadeDePassageiro;
	

	}

}
