package padroesarquiteturais.abstract_factory;

public class LgG4 implements CelularSmartphone {
	
	private String modelo;
	private String fabricante;
	private String conectividade;
	
	public LgG4() {
		modelo = "G4";
		fabricante = "LG";
		conectividade = "4G";
	}

	@Override
	public String getDadosSmartphone() {
		return "Fabricante: " + fabricante + " Modelo: " + modelo +
				" Conectividade: " + conectividade;
	}

}
