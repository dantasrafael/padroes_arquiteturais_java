package padroesarquiteturais.abstract_factory;

public class FabricaSamsung implements FabricaDeCelular {

	@Override
	public CelularSmartphone criarCelularSmartphone() {
		return new SamsungGalaxy();
	}

	@Override
	public CelularBasico criarCelularBasico() {
		return new SamsungE1270();
	}

}
