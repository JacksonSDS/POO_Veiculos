package br.com.magna.sistemas.veiculos.Automotor;

import br.com.magna.sistemas.veiculos.Interfaces.Passageiro;

public class Onibus implements Passageiro {
	
	public Integer MostrarCapacidadeDePassageiro = 75;
	
	@Override
	public Integer MostrarCapacidadeDePassageiro() {
		return MostrarCapacidadeDePassageiro;
	

	}

}
