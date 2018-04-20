package padroesarquiteturais.observer;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		new HexaObserver(pessoa);
		new OctalObserver(pessoa);
		new BinaryObserver(pessoa);
		
		System.out.println("Primeira idade: 20");
		pessoa.setIdade(20);
		System.out.println();
		System.out.println("Segunda idade: 5");
		pessoa.setIdade(5);
	}

}
