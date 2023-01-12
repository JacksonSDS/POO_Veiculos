package br.com.magna.sistemas.veiculos.modelo;

public class PropulsaoHumana extends Veiculos {
	
	private int ForçaFisica;

	public int getForçaFisica() {
		return ForçaFisica;
	}

	public void setForçaFisica(int forçaFisica) {
		ForçaFisica = forçaFisica;
	}
	
	public String pedalar() {
		return  "Você esta pedalando";
    }
	
	public String freiar() {
		return "Você esta freiando";
    }
	
	public String conduzir() {
		return "Você esta conduzizando seu veiculo";
    }
	
	public String equilibrar() {
        return "Você esta equilibrado";
    }
	
}
	
	
