package padroesarquiteturais.observer;

public class HexaObserver extends Observer {
	
	public HexaObserver(Pessoa poPessoa) {
		this.pessoa = poPessoa;
		this.pessoa.registrarObservers(this);
	}

	@Override
	public void atualizar() {
		System.out.println("Idade em Hexadecimal: " + Integer.toHexString(pessoa.getIdade()));
	}

}
