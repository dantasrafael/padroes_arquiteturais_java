package padroesarquiteturais.visitor;

public class Tela implements ComponenteComputador {

	@Override
	public void receber(ComponenteComputadorVisitor componenteComputadorVisitor) {
		componenteComputadorVisitor.visitar(this);
	}

}
