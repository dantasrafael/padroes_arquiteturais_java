package padroesarquiteturais.prototype;

public class Carro implements Cloneable {
	
	private String montadora;
	private String modelo;
	private double preco;
	
	public Carro() {
		this.montadora = "VolksWagen";
		this.modelo = "Fox";
		this.preco = 34000;
	}
	
	public Carro clone() {
		return new Carro();
	}

	public String getMontadora() {
		return montadora;
	}

	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
