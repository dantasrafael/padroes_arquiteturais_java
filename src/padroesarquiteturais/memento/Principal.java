/*
 * Objetivo: Sem violar a encapsulação, capturar e externalizar um estado interno de um objeto, de modo que o mesmo possa,
 * 			 posteriormente, ser restaurado para esse estado.
 *           
 * Deve-se aplicá-lo quando:
 * 		• Um instantâneo de (alguma porção do) estado de um objeto deve ser salvo de maneira que possa ser restaurado
 * 		  para esse estado mais tarde.
 * 		• Uma interface direta para obtenção do estado expõe detalhes de implementação e romperia o encapsulamento do objeto.
 */

package padroesarquiteturais.memento;

public class Principal {
	
	public static void main(String[] args) {
		Pessoa original = new Pessoa();
		Zelador zelador = new Zelador();
		original.setNome("Neide");
		original.setNome("Fátima");
		zelador.add(original.salvarMemento());
		original.setNome("Gisele");
		zelador.add(original.salvarMemento());
		original.setNome("Oswaldo");
		
		System.out.println("Pessoa corrente: " + original.getNome());
		original.getMemento(zelador.get(0));
		System.out.println("Primeira pessoa salva: " + original.getNome());
		original.getMemento(zelador.get(1));
		System.out.println("Segunda pessoa salva: " + original.getNome());
	}
	
}
