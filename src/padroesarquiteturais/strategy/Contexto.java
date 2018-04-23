package padroesarquiteturais.strategy;

public class Contexto {

	private final Strategy strategy;
	
	public Contexto(Strategy poStrategy) {
		this.strategy = poStrategy;
	}
	
	public void organizar(int[] vetor) {
		this.strategy.ordenar(vetor);
	}
}
