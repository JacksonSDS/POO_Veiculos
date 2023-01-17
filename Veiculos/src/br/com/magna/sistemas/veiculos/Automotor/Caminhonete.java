package br.com.magna.sistemas.veiculos.Automotor;

import br.com.magna.sistemas.veiculos.Interfaces.Carga;

public class Caminhonete implements Carga {

	public Integer capacidadeCarga = 1000;

	@Override
	public Integer mostrarCapacidadeDeCarga() {
		return capacidadeCarga;
	}

}
