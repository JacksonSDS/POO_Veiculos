package br.com.magna.sistemas.veiculos.modelo;

public class Ferroviario extends Motorizados {
	private int Vagoes;
	private int Series;
	private int CapacidadeTotal;
	
	public int getVagoes() {
		return Vagoes;
	}
	public void setVagoes(int vagoes) {
		Vagoes = vagoes;
	}
	public int getSeries() {
		return Series;
	}
	public void setSeries(int series) {
		Series = series;
	}
	public int getCapacidadeTotal() {
		return CapacidadeTotal;
	}
	public void setCapacidadeTotal(int capacidadeTotal) {
		CapacidadeTotal = capacidadeTotal;
	}
	
	
}
