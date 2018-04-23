/*
 * Objetivo: Permitir que objeto altere seu comportamento quando seu estado interno muda. O objeto parecerá ter mudado sua classe.
 *           
 * Deve-se aplicá-lo quando:
 * 		• O comportamento do objeto depende do seu estado e ele pode mudar seu comportamento em tempo e execução,
 * 		  dependendo desse estado.
 * 		• As operações têm comandos condicionais grandes, de várias alternativas, que dependem do estado do objeto.
 * 		  Esse estado é, normalmente, representado por uma ou mais constantes enumeradas.
 * 		  Frequentemente, várias operações conterão essa mesma estrutura condicional.
 * 		  O padrão state coloca cada ramo do comando adicional em uma classe separada.
 * 		  Isso lhe permite tratar o estado do objeto como um objeto propriamente dito, que pode variar independentemente
 * 		  de outro objetos. 
 */

package padroesarquiteturais.state;

public class Principal {

	public static void main(String[] args) {
		Alerta alerta = new Alerta();
		alerta.alertar();
		alerta.alertar();
		alerta.setAlerta(new ModoSonoro());
		alerta.alertar();
		alerta.alertar();
		alerta.alertar();		
	}

}
