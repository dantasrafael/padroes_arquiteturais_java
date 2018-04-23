package padroesarquiteturais.visitor;

public class Computador implements ComponenteComputador {

	ComponenteComputador[] componenteComputador;
	
	public Computador() {
		componenteComputador = new ComponenteComputador[]{new Mouse(), new Teclado(), new Tela()};
	 }

	@Override
	public void receber(ComponenteComputadorVisitor componenteComputadorVisitor) {
		for (int i = 0; i < componenteComputador.length; i++) {
			componenteComputador[i].receber(componenteComputadorVisitor);
		}
		componenteComputadorVisitor.visitar(this);
	}
	
}
