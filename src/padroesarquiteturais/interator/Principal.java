/*
 * Objetivo: Fornecer uma maneira de acessar sequencialmente os elementos de um objeto agregado sem expor
 * 			 sua representação subjacente.
 *           
 * Deve-se aplicá-lo quando:
 * 		• For acessar os conteúdos de um objeto agregado sem expor sua representação interna.
 * 		• For suportar múltiplos percursos de objetos agregados.
 * 		• For fornecer uma interface uniforme que percorra diferentes estruturas agregadas
 * 		  (ou seja, para suportar a iteração polimórfica).
 */

package padroesarquiteturais.interator;

public class Principal {
	
	public static void main(String[] args) {
		Colecao colecao = new Colecao();
		InterfaceIterator iterator = colecao.criarIterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
}
