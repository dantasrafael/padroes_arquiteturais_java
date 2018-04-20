package padroesarquiteturais.bridge;

public abstract class ControleRemotoAbstrato {
	
	private TelevisaoAbstrata tv;
	
	public ControleRemotoAbstrato(TelevisaoAbstrata poTV) {
		this.tv = poTV;
	}
	
	public void ligar() {
		this.tv.ligar();
	}
	
	public void desligar() {
		this.tv.desligar();
	}
	
	public void configurarCanal(int pnCanal) {
		this.tv.setCanal(pnCanal);
	}

}
