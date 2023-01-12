package br.com.magna.sistemas.veiculos.modelo;

public class Veiculos {
	private String Cor;
	private String Assento;
	private double Preço;
	private String Modelo;
	private int Ano;
	private int Rodas;
	private double Peso;

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public String getAssento() {
		return Assento;
	}

	public void setAssento(String assento) {
		Assento = assento;
	}

	public double getPreço() {
		return Preço;
	}

	public void setPreço(double preço) {
		Preço = preço;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public int getAno() {
		return Ano;
	}

	public void setAno(int ano) {
		Ano = ano;
	}

	public int getRodas() {
		return Rodas;
	}

	public void setRodas(int rodas) {
		Rodas = rodas;
	}

	public double getPeso() {
		return Peso;
	}

	public void setPeso(double peso) {
		Peso = peso;
	}

}
