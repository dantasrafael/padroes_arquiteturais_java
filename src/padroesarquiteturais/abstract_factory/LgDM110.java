package padroesarquiteturais.abstract_factory;

public class LgDM110 implements CelularBasico {
	
	private String modelo;
	private String fabricante;
	
	public LgDM110() {
		modelo = "DM110";
		fabricante = "LG";
	}

	@Override
	public String getDadosCelularBasico() {
		return "Fabricante: " + fabricante + " Modelo: " + modelo;
	}

}
