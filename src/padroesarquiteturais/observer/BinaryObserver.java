package padroesarquiteturais.observer;

public class BinaryObserver extends Observer {
	
	public BinaryObserver(Pessoa poPessoa) {
		this.pessoa = poPessoa;
		this.pessoa.registrarObservers(this);
	}

	@Override
	public void atualizar() {
		System.out.println("Idade em Binário: " + Integer.toBinaryString(pessoa.getIdade()));
	}

}
