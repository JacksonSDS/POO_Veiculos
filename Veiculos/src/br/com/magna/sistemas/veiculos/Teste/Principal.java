package br.com.magna.sistemas.veiculos.Teste;

import br.com.magna.sistemas.veiculos.Automotor.Caminhonete;
import br.com.magna.sistemas.veiculos.Automotor.Carro;
import br.com.magna.sistemas.veiculos.Automotor.Onibus;
import br.com.magna.sistemas.veiculos.Ferroviario.Trem;

public class Principal {
	public static void main(String[] args) {
		
		Onibus onibus = new Onibus();
		System.out.println(onibus.MostrarCapacidadeDePassageiro());
	
		Caminhonete caminhonete = new Caminhonete();
		System.out.println(caminhonete.mostrarCapacidadeDeCarga());
		
		Carro carro = new Carro();
		System.out.println(carro.MostrarCapacidadeDePassageiro());
		System.out.println(carro.mostrarCapacidadeDeCarga());
		
		System.out.println("-------------------");
		
		Trem tremzinho = new Trem();
		
		tremzinho.setSeries(2723);
		tremzinho.setVagoes(17);
		
		System.out.println(tremzinho.abrirPorta());
		System.out.println(tremzinho.fecharPorta());
		tremzinho.acelerar();
		
		System.out.println(tremzinho.getSeries());
		System.out.println(tremzinho.getVagoes());
		
	}

}
