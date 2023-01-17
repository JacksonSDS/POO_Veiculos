package br.com.magna.sistemas.veiculos.Automotor;

import br.com.magna.sistemas.veiculos.Interfaces.Carga;
import br.com.magna.sistemas.veiculos.Interfaces.Passageiro;

public class Van implements Passageiro, Carga {
	
	public Integer MostrarCapacidadeDePassageiro = 15;
	
	@Override
	public Integer MostrarCapacidadeDePassageiro() {
		return MostrarCapacidadeDePassageiro;
	}	
		
public Integer capacidadeCarga = 1200;

	@Override
	public Integer mostrarCapacidadeDeCarga() {
		return capacidadeCarga;
	}


}


