/*
 * Objetivo: Definir um esqueleto de um algoritmo em uma operação postergando a definição de alguns passos para subclasses.
 * 			 O template method permite que as sublcasses redefinam certos passos de um algoritmo sem mudar sua estrutura.
 *           
 * Deve-se aplicá-lo quando:
 * 		• For implementar as partes invariantes de um algoritmo uma só vez e deixar para as subclasses a
 * 		  implementação do comportamento que pode variar.
 * 		• O comportamento comum entre subclasses deve ser fatorado e concentrado numa classe comum para evitar duplicação de código.
 * 		• For controlar extensões de subclasses. Você definir um método template que chama operações “gancho” em pontos específicos,
 * 		  permitindo, dessa forma, extensões somente nesses pontos.
 */

package padroesarquiteturais.template_method;

public class Principal {

	public static void main(String[] args) {
		Aplicativo iphone = new AplicativoIphone();
		iphone.gerar();
		System.out.println();
		Aplicativo galaxy = new AplicativoAndroid();
		galaxy.gerar();		
	}

}
