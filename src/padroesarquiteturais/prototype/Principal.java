/*
 * Objetivo: Especificar os tipos de objetos a serem criados usando uma instância prototípica
 * 			 e criar novos objetos copiando este protótipo.
 *           
 * Deve-se aplicá-lo quando:
 * 		• As classes a instanciar forem especificadas em tempo de execução;
 * 		• Se deseja evitar a construção de uma hierarquia de classes de fábricas paralela
 * 		  à hierarquia de classes de produto;
 * 		• As instâncias de uma classe puderem ter uma dentre poucas combinações diferentes de estados. 
 */

package padroesarquiteturais.prototype;

public class Principal {

	public static void main(String[] args) {
		Carro carroBasico = new Carro();
		Carro carroClone = carroBasico.clone();
		carroClone.setModelo("CrossFox");
		carroClone.setPreco(78000);
		System.out.println("Carro Básico:");
		System.out.println("Montadora:" + carroBasico.getMontadora());
		System.out.println("Modelo:" + carroBasico.getModelo());
		System.out.println("Valor:" + carroBasico.getPreco());
		System.out.println("Carro offRoad:");
		System.out.println("Montadora:" + carroClone.getMontadora());
		System.out.println("Modelo:" + carroClone.getModelo());
		System.out.println("Valor:" + carroClone.getPreco());
	}

}
