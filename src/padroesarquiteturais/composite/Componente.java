package padroesarquiteturais.composite;

public class Componente implements InterfaceComponente {
	
	String nome;
	
	public Componente(String psNome) {
		nome = psNome;
	}

	@Override
	public void exibir() {
		System.out.println(nome);
	}

}
