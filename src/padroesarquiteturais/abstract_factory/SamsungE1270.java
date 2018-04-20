package padroesarquiteturais.abstract_factory;

public class SamsungE1270 implements CelularBasico {
	
	private String modelo;
	private String fabricante;
	
	public SamsungE1270() {
		modelo = "E1270";
		fabricante = "Samsung";
	}

	@Override
	public String getDadosCelularBasico() {
		return "Fabricante: " + fabricante + " Modelo: " + modelo;
	}

}
