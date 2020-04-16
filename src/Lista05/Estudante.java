package Lista05;

public class Estudante {

	private String nome;
	private String matricula; 
	private String endereco;
	private double [] notas = new double [4];

	public Estudante(String nome, String matricula, String endereco, double[] notas) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.endereco = endereco;
		this.notas = notas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double calcularMedia() {
		double soma = 0;
		double media = 0;
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}
		media = soma/4;
		return media;
	}
}
