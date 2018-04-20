/*
 * Objetivo: Separar uma abstração de sua implementação, de modo que as duas possam variar independentemente.
 *           
 * Deve-se aplicá-lo quando:
 * 		• Se deseja evitar um vínculo permanente entre uma abstração e sua implementação.
 * 		  Isso pode ocorrer, por exemplo, quando a implementação deve ser selecionada ou alterada em tempo de execução;
 * 		• Tanto as abstrações como suas implementações tiverem de ser extensíveis por meio de subclasses.
 * 		  Nesse caso, o padrão Bridge permitir combinar as diferentes abstrações e implementações e entendê-las independentemente;
 * 		• Mudanças na implementação de uma abstração não puderem ter impacto sobre os clientes, ou seja,
 * 		  quando o código dos mesmos não puder ser recompilado;
 * 		• (C++) Se deseja ocultar completamente a implementação de uma abstração dos clientes.
 * 		  Em C++, a representação de uma classe é visível na interface da classe;
 * 		• Se deseja compartilhar uma implementação entre múltiplos objetos (talvez usando a contagem de referências)
 * 		  e este fato deve estar ocultado do cliente. 
 */

package padroesarquiteturais.bridge;

public class Principal {

	public static void main(String[] args) {
		TelevisaoAbstrata televisao = new TelevisaoLCD();
		ControleRemotoLogitech controleRemoto = new ControleRemotoLogitech(televisao);
		
		televisao.ligar();
		controleRemoto.selecionarCanal(100);
		
		System.out.println("Canal selecionado: "+ televisao.getCanal());
		televisao.desligar();
	}

}
