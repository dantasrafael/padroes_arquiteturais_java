package padroesarquiteturais.bridge;

public abstract class TelevisaoAbstrata {
	
	private int canal;
	
	public abstract void ligar();
	
	public abstract void desligar();
	
	public int getCanal() {
		return canal;
	}
	
	public void setCanal(int canal) {
		this.canal = canal;
	}

}
