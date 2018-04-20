package padroesarquiteturais.bridge;

public class TelevisaoLCD extends TelevisaoAbstrata {

	@Override
	public void ligar() {
		System.out.println("Televisão LCD Ligada");
	}

	@Override
	public void desligar() {
		System.out.println("Televisão LCD Desligada");
	}

}
