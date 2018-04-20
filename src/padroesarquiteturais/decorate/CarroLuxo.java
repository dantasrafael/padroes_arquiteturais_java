package padroesarquiteturais.decorate;

public class CarroLuxo extends CarroDecorator {
	
	public CarroLuxo(InterfaceCarro poCarro) {
		super(poCarro);
	}

	@Override
	public void montar() {
		this.carro.montar();
		System.out.println("Adicionando características de Carro Luxo.");
	}

}
