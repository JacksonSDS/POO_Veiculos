package br.com.magna.sistemas.veiculos.modelo;

public abstract class Automotor extends Motorizados {
	
	private Integer hodometro;
	private String Placa;
	private String Categoria;
	
	public Integer getHodometro() {
		return hodometro;
	}
	public void setHodometro(int hodometro) {
		this.hodometro = hodometro;
	}
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		this.Placa = placa;
	}
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		this.Categoria = categoria;
	}
	
}
