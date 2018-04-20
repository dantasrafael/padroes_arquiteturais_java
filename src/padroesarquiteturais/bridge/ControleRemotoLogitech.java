package padroesarquiteturais.bridge;

public class ControleRemotoLogitech extends ControleRemotoAbstrato {

	public ControleRemotoLogitech(TelevisaoAbstrata poTV) {
		super(poTV);
	}
	
	public void selecionarCanal(int pnCanal) {
		configurarCanal(pnCanal);		
	}

}
