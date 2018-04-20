/*
 * Objetivo: Fornecer uma interface unificada para um conjunto de interfaces em um subsistema.
 * 			 O Facade define uma interface de nível mais alto que torna o subsistema mais fácil de usar.
 *           
 * Deve-se aplicá-lo quando:
 * 		• Se deseja fornecer uma interface mais simples para um subsistema complexo.
 * 		• Existirem muitas dependências entre clientes e classes de implementação de uma abstração.
 * 		• Se deseja estruturar os subsistemas em camadas.
 */

package padroesarquiteturais.facade;

public class Principal {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.executar();
	}

}
