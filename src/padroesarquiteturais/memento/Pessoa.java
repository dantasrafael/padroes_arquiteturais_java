package padroesarquiteturais.memento;

public class Pessoa {
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Memento salvarMemento() {
		return new Memento(this.nome);
	}
	
	public void getMemento(Memento poMemento) {
		this.nome = poMemento.getNome();
	}
	
}
