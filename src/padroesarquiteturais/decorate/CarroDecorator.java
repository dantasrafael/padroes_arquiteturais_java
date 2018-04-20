package padroesarquiteturais.decorate;

public class CarroDecorator implements InterfaceCarro {
	
	protected InterfaceCarro carro;
	
	public CarroDecorator(InterfaceCarro poCarro) {
		this.carro = poCarro;
	}

	@Override
	public void montar() {
		this.carro.montar();
	}

}
