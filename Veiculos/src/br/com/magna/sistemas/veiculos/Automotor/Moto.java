package br.com.magna.sistemas.veiculos.Automotor;

import br.com.magna.sistemas.veiculos.Interfaces.Passageiro;

public class Moto implements Passageiro {
	
public int MostrarCapacidadeDePassageiro = 2;
	
	@Override
	public Integer MostrarCapacidadeDePassageiro() {
		return MostrarCapacidadeDePassageiro;
		
	}
}
