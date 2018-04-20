package padroesarquiteturais.composite;

import java.util.ArrayList;
import java.util.List;

public class ContainerComponente implements InterfaceComponente {
	
	private List<InterfaceComponente> listaComponentes = new ArrayList<>();
	
	public void incluir(InterfaceComponente poComponent) {
		listaComponentes.add(poComponent);
	}
	
	public void remover(InterfaceComponente poComponent) {
		listaComponentes.remove(poComponent);
	}

	@Override
	public void exibir() {
		for (InterfaceComponente component : listaComponentes) {
			component.exibir();
		}		
	}

}
