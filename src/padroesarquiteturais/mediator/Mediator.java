package padroesarquiteturais.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator implements InterfaceMediator {
	
	private List<UsuarioAbstrato> usuarios;
	
	public Mediator() {
		this.usuarios = new ArrayList<>();
	}

	@Override
	public void enviarMensagem(String psMensagem, UsuarioAbstrato poUsuario) {
		for (UsuarioAbstrato usuarioAbst : this.usuarios) {
			if (usuarioAbst != poUsuario) {
				usuarioAbst.recebendo(psMensagem);
			}
		}
	}

	@Override
	public void adicionarUsuario(UsuarioAbstrato poUsuario) {
		this.usuarios.add(poUsuario);
	}

}
