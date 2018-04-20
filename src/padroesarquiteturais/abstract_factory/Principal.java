/*
 * Objetivo: Prover uma interface para criar famílias de objetos relacionados ou dependentes
 * 			 sem especificar suas classes concretas.
 *           
 * Deve-se aplicá-lo quando:
 * 		• Um sistema for independente de como seus produtos são criados, compostos e representados;
 * 		• Um sistema for configurado com uma entre várias famílias de produtos;
 * 		• Uma família de produtos relacionados for projetada para uso conjunto e você for implementar essa restrição;
 * 		• Quiser fornecer uma biblioteca de classes e revelar sua interface e não sua implementação.
 */

package padroesarquiteturais.abstract_factory;

public class Principal {

	public static void main(String[] args) {
		FabricaDeCelular fabrica = null;
		CelularSmartphone celularSmartphone = null;
		CelularBasico celularBasico = null;
		
		fabrica = new FabricaSamsung();
		celularSmartphone = fabrica.criarCelularSmartphone();
		celularBasico = fabrica.criarCelularBasico();
		System.out.println(celularSmartphone.getDadosSmartphone());
		System.out.println(celularBasico.getDadosCelularBasico() + "\n\n");

		fabrica = new FabricaLG();
		celularSmartphone = fabrica.criarCelularSmartphone();
		celularBasico = fabrica.criarCelularBasico();
		System.out.println(celularSmartphone.getDadosSmartphone());
		System.out.println(celularBasico.getDadosCelularBasico());

	}

}
