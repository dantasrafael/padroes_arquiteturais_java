package padroesarquiteturais.observer;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	
	private List<Observer> listaObservers = new ArrayList<>();
	private int idade;
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int pnIdade) {
		this.idade = pnIdade;
		notificarTodosObservers();
	}
	
	public void registrarObservers(Observer poObserver) {
		listaObservers.add(poObserver);
	}
	
	public void notificarTodosObservers() {
		for (Observer observer : listaObservers) {
			observer.atualizar();
		}
	}
	
}
