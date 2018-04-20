package padroesarquiteturais.abstract_factory;

public class SamsungGalaxy implements CelularSmartphone {
	
	private String modelo;
	private String fabricante;
	private String conectividade;
	
	public SamsungGalaxy() {
		modelo = "Galaxy";
		fabricante = "Samsung";
		conectividade = "3G";
	}

	@Override
	public String getDadosSmartphone() {
		return "Fabricante: " + fabricante + " Modelo: " + modelo +
				" Conectividade: " + conectividade;
	}

}
