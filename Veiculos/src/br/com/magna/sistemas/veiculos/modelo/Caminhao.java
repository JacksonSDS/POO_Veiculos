package br.com.magna.sistemas.veiculos.modelo;

public class Caminhao implements Carga {

	public int capacidadeCarga = 7500;
	
	@Override
	public int mostrarCapacidade() {
		return capacidadeCarga;
	}

}
