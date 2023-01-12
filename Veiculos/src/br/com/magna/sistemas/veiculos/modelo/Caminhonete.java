package br.com.magna.sistemas.veiculos.modelo;

public class Caminhonete implements Carga {

	public int capacidadeCarga = 1000;

	@Override
	public int mostrarCapacidade() {
		return capacidadeCarga;
	}

}
