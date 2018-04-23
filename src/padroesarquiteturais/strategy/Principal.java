/*
 * Objetivo: Definir uma família de algoritmos, encapsular cada um deles e fazê-los intercambiáveis.
 * 			 O strategy permite que o algoritmo varie independentemente dos clientes que o utilizam.
 *           
 * Deve-se aplicá-lo quando:
 * 		• Muitas classes relacionadas diferem somente no seu comportamento.
 * 		  As estratégias fornecem uma maneira de configurar uma classe com um dentre muitos comportamentos.
 * 		• Você necessita de variantes de um algoritmo. Por exemplo, pode definir algoritmos que refletem diferentes
 * 		  soluções de compromisso entre espaço/tempo.
 * 		• As estratégias podem ser usadas quando essas variantes são implementadas como uma hierarquia de classes de algoritmos.
 * 		• Um algoritmo usa dados dos quais os clientes não deveriam ter conhecimento.
 * 		  Use o padrão strategy para evitar a exposição das estruturas de dados complexas, específicas do algoritmo.
		• Uma classe define muitos comportamentos e aparecem em suas operações como múltiplos comandos condicionais da linguagem.
		  Em vez de usar muitos comandos condicionais, mova os ramos condicionais relacionados para sua própria classe strategy.
 */

package padroesarquiteturais.strategy;

public class Principal {

	public static void main(String[] args) {		
		int[] vetor = {1, 2, 3, 4, 5};
		Contexto contexto = new Contexto(new BubbleSort());
		contexto.organizar(vetor);
		contexto = new Contexto(new QuickSort());
		contexto.organizar(vetor);		
	}

}
