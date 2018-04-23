/*
 * Objetivo: Encapsular uma solicitação como um objeto e, dessa forma, permitindo que você parametrize clientes
 * 			 com diferentes solicitações, enfileire ou registre solicitações e suporte operações que podem ser desfeitas.
 *           
 * Deve-se aplicá-lo quando:
 * 		• Parametrizar objetos por uma ação a ser executada.
 * 		• Especificar, enfileirar e executar solicitações em tempos diferentes.
 * 		• Suportar desfazer operações.
 * 		• Suportar o registro (logging) de mudanças de maneiras que possam ser reaplicadas no caso de uma queda de sistema.
 * 		• Estruturar um sistema em torno de operações de alto nível construídas sobre operações primitivas.
 */

package padroesarquiteturais.command;

public class Principal {

	public static void main(String[] args) {
		Interruptor interruptor = new Interruptor();
		Lampada lampada = new Lampada();
		Comando ligarLampada = new LigarLampadaComando(lampada);
		Comando desligarLampada = new DesligarLampadaComando(lampada);
		interruptor.setComando(ligarLampada);
		interruptor.pressionarInterruptor();
		interruptor.setComando(desligarLampada);
		interruptor.pressionarInterruptor();
	}

}
