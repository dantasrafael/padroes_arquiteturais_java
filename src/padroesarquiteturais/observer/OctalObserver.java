package padroesarquiteturais.observer;

public class OctalObserver extends Observer {
	
	public OctalObserver(Pessoa poPessoa) {
		this.pessoa = poPessoa;
		this.pessoa.registrarObservers(this);
	}

	@Override
	public void atualizar() {
		System.out.println("Idade em Octal: " + Integer.toOctalString(pessoa.getIdade()));
	}

}
