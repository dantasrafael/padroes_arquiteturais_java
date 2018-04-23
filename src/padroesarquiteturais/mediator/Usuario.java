package padroesarquiteturais.mediator;

public class Usuario extends UsuarioAbstrato {
	
	public Usuario(InterfaceMediator poInterfaceMediator, String psNome) {
		super(poInterfaceMediator, psNome);
	}

	@Override
	public void enviando(String psMensagem) {
		System.out.println(this.nome + ": Enviando a mensagem = " + psMensagem);
		mediator.enviarMensagem(psMensagem, this);
	}

	@Override
	public void recebendo(String psMensagem) {
		System.out.println(this.nome + ": Mensagem recebida = " + psMensagem);
	}

}
