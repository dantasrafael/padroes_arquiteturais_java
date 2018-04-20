package padroesarquiteturais.singleton;

public class ClasseSingleton {
	
	private static ClasseSingleton aux = null;
	private String nome = null;
	
	public ClasseSingleton() {
		this.nome = "Fulano de Tal";
	}
	
	public static ClasseSingleton getInstance() {
		if (aux == null) {
			aux = new ClasseSingleton();
		}
		return aux;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
