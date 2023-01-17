package br.com.magna.sistemas.veiculos.modelo;

public abstract class Motorizados extends Veiculos {
	
	private double Motor;
	private Integer potencia;
	private Integer VeloMaxima;
	
	public double getMotor() {
		return Motor;
	}
	public void setMotor(double motor) {
		this.Motor = motor;
	}
	public Integer getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public Integer getVeloMaxima() {
		return VeloMaxima;
	}
	public void setVeloMaxima(int veloMaxima) {
		this.VeloMaxima = veloMaxima;
	}
	
	 public void acelerar() {
	        System.out.println("Veiculo acelerando !!!");
	    }
	 
	 public void freiar() {
	        System.out.println("Veiculo freiando !!!");
	    }
	 
	 public String abrirPorta() {
	        return "O veiculo abriu a porta !!!";
	    }
	 
	 public String fecharPorta() {
	        return "O veiculo fechar a porta !!!";
	    }
	 
	 public String passarMarcha() {
	        return "O veiculo passou a marcha !!!";
	    }

}
