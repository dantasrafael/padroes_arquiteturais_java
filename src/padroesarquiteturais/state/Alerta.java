package padroesarquiteturais.state;

public class Alerta {
	
	private ModoAlerta alertaCorrente;
	
	public Alerta() {
		this.alertaCorrente = new ModoVibracao();
	}
	
	public void setAlerta(ModoAlerta alertaCorrente) {
		this.alertaCorrente = alertaCorrente;
	}
	
	public void alertar() {
		this.alertaCorrente.alertar(this);
	}

}
