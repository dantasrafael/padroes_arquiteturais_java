package padroesarquiteturais.visitor;

public interface ComponenteComputadorVisitor {

	public void visitar(Computador computador);
	
	public void visitar(Mouse mouse);
	
	public void visitar(Teclado teclado);
	
	public void visitar(Tela tela);

}
