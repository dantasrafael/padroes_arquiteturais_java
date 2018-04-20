package padroesarquiteturais.adapter;

public class CarteiraAdapter extends CarteiraMotorista_B {

	private CarteiraMotorista_D carteiraD;
	
	public CarteiraAdapter(CarteiraMotorista_D poCarteiraD) {
		this.carteiraD = poCarteiraD;
	}
	
	public void setCategoria(String categoria) {
		this.carteiraD.setCategoria(categoria + " - "+ carteiraD.getCategoria());
	}	
	
	public String getCategoria() {
		return this.carteiraD.getCategoria();
	}

}
