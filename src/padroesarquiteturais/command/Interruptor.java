package padroesarquiteturais.command;

public class Interruptor {
	
	private Comando comando;
	
	public void setComando(Comando poComando) {
		this.comando = poComando;
	}
	
	public void pressionarInterruptor() {
		this.comando.executar();
	}

}
