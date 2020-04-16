package Lista05;

public class Circulo {

	private int raio;

	public Circulo(int raio) {
		super();
		this.raio = raio;
	}

	public int getRaio() {
		return raio;
	}
	public void setRaio(int raio) {
		this.raio = raio;
	}


	public double calculaArea() {
		return Math.PI*(this.raio*this.raio);
	}

	public double calculaPerimetro() {
		return 2*Math.PI*raio;
	}

}
