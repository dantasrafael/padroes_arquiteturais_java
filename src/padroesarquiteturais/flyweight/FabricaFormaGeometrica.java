package padroesarquiteturais.flyweight;

import java.util.HashMap;

public class FabricaFormaGeometrica {
	
	private static final HashMap<String, FormaGeometrica> mapaCirculo = new HashMap<>();
	
	public static FormaGeometrica getCirculo(String cor) {
		Circulo circulo = (Circulo) mapaCirculo.get(cor);
		
		if (circulo == null) {
			circulo = new Circulo(cor);
			mapaCirculo.put(cor, circulo);
			System.out.println("Criando circulo de cor : " + cor);
		}
		
		return circulo;
	 }

}
