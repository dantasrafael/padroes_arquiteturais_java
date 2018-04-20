/*
 * Objetivo: Atribuir responsabilidades adicionais a um objeto dinamicamente.
 * 			 Os decorators fornecem uma alternativa flexível a subclasses para extensão da funcionalidade.
 *           
 * Deve-se aplicá-lo quando:
 * 		• For para acrescentar responsabilidades a objetos individuais de forma dinâmica e transparente, ou seja,
 * 		  sem afetar outros objetos;
 * 		• For para responsabilidades que podem ser removidas;
 * 		• A extensão através do uso de subclasses não for prática.
 */

package padroesarquiteturais.decorate;

public class Principal {

	public static void main(String[] args) {
		InterfaceCarro sportsCar = new CarroSport(new CarroBasico());
		sportsCar.montar();
		
		InterfaceCarro sportsLuxuryCar = new CarroSport(new CarroLuxo(new CarroBasico()));
		sportsLuxuryCar.montar();
	}

}
