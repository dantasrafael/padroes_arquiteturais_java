package padroesarquiteturais.command;

public class LigarLampadaComando implements Comando {
	
	Lampada lampada;
	
	public LigarLampadaComando(Lampada poLampada) {
		this.lampada = poLampada;
	}

	@Override
	public void executar() {
		this.lampada.ligar();
	}

}
