/*
 * Objetivo: Representar uma operação a ser executada sobre os elementos da estrutura de um objeto.
 * 			 O visitor permite que você defina uma nova operação sem mudar as classes dos elementos sobre os quais opera.
 *           
 * Deve-se aplicá-lo quando:
 * 		• Uma estrutura de objetos contém muitas classes de objetos com interfaces que diferem,
 * 		  e quando deseja-se executar operações sobre esses objetos que dependem das suas classes concretas.
 * 		• Muitas operações distintas e não relacionadas necessitam ser executadas sobre objetos de uma estrutura de objetos,
 * 		  e deseja-se evitar “a poluição” das suas classes com essas operações.
 * 		  O Visitor permite manter juntas operações relacionadas, definindo-as em uma única classe.
 * 		  Quando a estrutura do objeto for compartilhada por muitas aplicações, use visitor para pôr operações somente
 * 		  naquelas aplicações que as necessitam.
 * 		• As classes que definem a estrutura do objeto raramente mudam, porém, frequentemente deseja-se definir novas
 * 		  operações sobre a estrutura. A mudança das classes da estrutura do objeto requer a redefinição da interface para
 * 		  todos os visitantes, o que é potencialmente oneroso. Se as classes da estrutura do objeto mudam com frequência,
 * 		  provavelmente é melhor definir as operações nessas classes.
 */

package padroesarquiteturais.visitor;

public class Principal {

	public static void main(String[] args) {
		ComponenteComputador computer = new Computador();
		computer.receber(new ComputerPartDisplayVisitor());
	}

}
