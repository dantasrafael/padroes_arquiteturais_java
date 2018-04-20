package padroesarquiteturais.bridge;

public class TelevisaoLED extends TelevisaoAbstrata {

	@Override
	public void ligar() {
		System.out.println("Televisão LED Ligada");
	}

	@Override
	public void desligar() {
		System.out.println("Televisão LED Desligada");
	}

}
