/*
 * Objetivo: Definir uma dependência um-para-muitos entre objetos, de modo que,
 *           quando um objeto muda de estado, todos os seus dependentes são automaticamente notificados e atualizados.
 *           
 * Deve-se aplicá-lo quando:
 * 		• Uma abstração tem dois aspectos, um dependente do outro.
 * 		  Encapsulando esses aspectos em objetos separados, permite-se variá-los e reutilizá-los independentemente;
 * 		• Uma mudança em um objeto exige mudanças em outros, e você não sabe quantos objetos necessitam ser mudados;
 * 		• Um objeto deveria ser capaz de notificar outros objetos sem fazer hipóteses, ou usar informações,
 * 		  sobre quem são esses objetos. Em outras palavras, quando não se deseja que esses objetos sejam fortemente acoplados.
 */

package padroesarquiteturais.observer;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		new HexaObserver(pessoa);
		new OctalObserver(pessoa);
		new BinaryObserver(pessoa);
		
		System.out.println("Primeira idade: 20");
		pessoa.setIdade(20);
		System.out.println();
		System.out.println("Segunda idade: 5");
		pessoa.setIdade(5);
	}

}
