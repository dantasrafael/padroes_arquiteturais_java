package padroesarquiteturais.memento;

import java.util.ArrayList;
import java.util.List;

public class Zelador {

	private List<Memento> listaMementos = new ArrayList<>();
	
	public void add(Memento poMemento) {
		listaMementos.add(poMemento);
	}
	
	public Memento get(int pnIndice) {
		return listaMementos.get(pnIndice);
	}
	
}
