package padroesarquiteturais.visitor;

public class ComputerPartDisplayVisitor implements ComponenteComputadorVisitor {
	
	@Override
	public void visitar(Computador computador) {
		System.out.println("Computador.");
	}

	@Override
	public void visitar(Mouse mouse) {
		System.out.println("Mouse.");
	}

	@Override
	public void visitar(Teclado teclado) {
		System.out.println("Teclado.");
	}

	@Override
	public void visitar(Tela tela) {
		System.out.println("Tela.");
	}	
	
}
