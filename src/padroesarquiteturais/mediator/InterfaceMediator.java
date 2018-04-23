package padroesarquiteturais.mediator;

public interface InterfaceMediator {
	
	public void enviarMensagem (String psMensagem, UsuarioAbstrato poUsuario);
	
	public void adicionarUsuario (UsuarioAbstrato poUsuario);

}
