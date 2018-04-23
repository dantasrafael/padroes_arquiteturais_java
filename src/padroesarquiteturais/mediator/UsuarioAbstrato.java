package padroesarquiteturais.mediator;

public abstract class UsuarioAbstrato {
	
	protected InterfaceMediator mediator;
	protected String nome;
	
	public UsuarioAbstrato(InterfaceMediator poMediator, String psNome) {
		this.mediator = poMediator;
		this.nome = psNome;
	}
	
	public abstract void enviando(String psMensagem);
	
	public abstract void recebendo(String psMensagem);

}
