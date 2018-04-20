package padroesarquiteturais.factory_method;

public abstract class Aluno {
	
	private String nome;
	private double teste;
	private double prova;
	
	public Aluno(String psNome, double pnTeste, double pnProva) {
		this.nome = psNome;
		this.teste = pnTeste;
		this.prova = pnProva;
	}

	public abstract double getMedia();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getTeste() {
		return teste;
	}

	public void setTeste(double teste) {
		this.teste = teste;
	}

	public double getProva() {
		return prova;
	}

	public void setProva(double prova) {
		this.prova = prova;
	}

}
