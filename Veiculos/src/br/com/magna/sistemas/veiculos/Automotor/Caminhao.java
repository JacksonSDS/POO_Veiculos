package br.com.magna.sistemas.veiculos.Automotor;

import br.com.magna.sistemas.veiculos.Interfaces.Carga;

public class Caminhao implements Carga {

	public Integer capacidadeCarga = 7500;
	
	@Override
	public Integer mostrarCapacidadeDeCarga() {
		return capacidadeCarga;
	}

}
