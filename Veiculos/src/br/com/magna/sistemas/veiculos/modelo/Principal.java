package br.com.magna.sistemas.veiculos.modelo;

public class Principal {
	public static void main(String[] args) {
		
		Onibus onibus = new Onibus();
		System.out.println(onibus.MostrarCapacidadeDePassageiro());
	
		Caminhonete caminhonete = new Caminhonete();
		System.out.println(caminhonete.mostrarCapacidade());
		
	}

}
