package br.com.magna.sistemas.veiculos.Automotor;

import br.com.magna.sistemas.veiculos.Interfaces.Carga;
import br.com.magna.sistemas.veiculos.Interfaces.Passageiro;

public class Carro implements Passageiro, Carga {

	public Integer MostrarCapacidadeDePassageiro = 4;
	
	@Override
	public Integer MostrarCapacidadeDePassageiro() {
		return MostrarCapacidadeDePassageiro;
	}	
		
public Integer capacidadeCarga = 700;

	@Override
	public Integer mostrarCapacidadeDeCarga() {
		return capacidadeCarga;
	}


}
