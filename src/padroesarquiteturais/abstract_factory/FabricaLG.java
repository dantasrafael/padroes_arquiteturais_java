package padroesarquiteturais.abstract_factory;

public class FabricaLG implements FabricaDeCelular {

	@Override
	public CelularSmartphone criarCelularSmartphone() {
		return new LgG4();
	}

	@Override
	public CelularBasico criarCelularBasico() {
		return new LgDM110();
	}

}
