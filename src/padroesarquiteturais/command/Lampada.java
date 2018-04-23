package padroesarquiteturais.command;

public class Lampada {
	
	private boolean ligada;
	
	public void ligar() {
		this.ligada = true;
		this.exibirStatus();
	}
	
	public void desligar() {
		this.ligada = false;
		this.exibirStatus();
	}
	
	public void exibirStatus() {
		if (this.ligada) {
			System.out.println("A lâmpada está ligada");
		} else {
			System.out.println("A lâmpada está desligada");
		}
	}

}
