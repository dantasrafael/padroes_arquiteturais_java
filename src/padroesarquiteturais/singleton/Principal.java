/*
 * Objetivo: Garantir que uma classe tenha somente uma instância e fornecer um ponto global de acesso para ela.
 *           
 * Deve-se aplicá-lo quando:
 * 		• Houver apenas uma instância de uma classe, e essa instância tiver que dar acesso
 * 		  aos clientes através de um ponto bem conhecido;
 * 		• A única instância tiver que ser extensível através de subclasses, possibilitando aos clientes
 * 		  usar uma instância estendida sem alterar o seu código. 
 */

package padroesarquiteturais.singleton;

public class Principal {

	public static void main(String[] args) {
		ClasseSingleton objSingleton = ClasseSingleton.getInstance();
		System.out.println("Nome: " + objSingleton.getNome());
	}

}
