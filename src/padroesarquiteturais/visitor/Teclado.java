package padroesarquiteturais.visitor;

public class Teclado implements ComponenteComputador {

	@Override
	public void receber(ComponenteComputadorVisitor componenteComputadorVisitor) {
		componenteComputadorVisitor.visitar(this);
	}

}
