package padroesarquiteturais.flyweight;

public class Circulo implements FormaGeometrica {
	
	private String cor;
	private int x;
	private int y;
	private int radianos;
	
	public Circulo(String psCor) {
		this.cor = psCor;
	}

	@Override
	public void desenhar() {
		System.out.println("Circulo: Desenhando() [Cor:" + this.cor +
				", x:" + this.x + ", y:" + this.y + ", Radianos:" + this.radianos + "]");
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setRadianos(int radianos) {
		this.radianos = radianos;
	}

}
