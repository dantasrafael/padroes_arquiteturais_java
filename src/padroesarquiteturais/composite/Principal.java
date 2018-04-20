/*
 * Objetivo: Compor objetos em estrutura de árvore para representar hierarquias do tipo partes-todo.
 * 			 O Composite permite que os clientes tratem objetos individuais e composições de objetos de maneira uniforme.
 *           
 * Deve-se aplicá-lo quando:
 * 		• Quiser representar hierarquias partes-todo de objetos.
 * 		• Quiser que os clientes sejam capazes de ignorar a diferença entre composições de objetos e objetos individuais.
 * 		• Os clientes tratarem todos os objetos na estrutura composta de maneira uniforme.
 */

package padroesarquiteturais.composite;

public class Principal {

	public static void main(String[] args) {
		Componente componenteUnitario1 = new Componente("Componente Unitário 1");
		Componente componenteUnitario2 = new Componente("Componente Unitário 2");
		Componente componenteUnitario3 = new Componente("Componente Unitário 3");
		Componente componenteUnitario4 = new Componente("Componente Unitário 4");
		Componente componenteUnitario5 = new Componente("Componente Unitário 5");
		
		ContainerComponente container1 = new ContainerComponente();
		container1.incluir(componenteUnitario1);
		container1.incluir(componenteUnitario2);
		
		ContainerComponente container2 = new ContainerComponente();
		container2.incluir(componenteUnitario3);
		container2.incluir(componenteUnitario4);
		container2.incluir(componenteUnitario5);
		
		container1.incluir(container2);
		container1.exibir();
	}

}
