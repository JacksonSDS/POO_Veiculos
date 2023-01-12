package br.com.magna.sistemas.veiculos.modelo;

public class Moto implements Passageiro {
	
public int MostrarCapacidadeDePassageiro = 2;
	
	@Override
	public int MostrarCapacidadeDePassageiro() {
		return MostrarCapacidadeDePassageiro;
		
	}
}
