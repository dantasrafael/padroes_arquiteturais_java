package padroesarquiteturais.command;

public class DesligarLampadaComando implements Comando {
	
	Lampada lampada;
	
	public DesligarLampadaComando(Lampada poLampada) {
		this.lampada = poLampada;
	}

	@Override
	public void executar() {
		this.lampada.desligar();
	}

}
