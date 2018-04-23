package padroesarquiteturais.visitor;

public class Mouse implements ComponenteComputador {

	@Override
	public void receber(ComponenteComputadorVisitor componenteComputadorVisitor) {
		componenteComputadorVisitor.visitar(this);
	}

}
