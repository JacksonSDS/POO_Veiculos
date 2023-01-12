package br.com.magna.sistemas.veiculos.modelo;

public class Automotor extends Motorizados {
	
	private int hodometro;
	private String Placa;
	private String Categoria;
	
	public int getHodometro() {
		return hodometro;
	}
	public void setHodometro(int hodometro) {
		this.hodometro = hodometro;
	}
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		Placa = placa;
	}
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	
}
