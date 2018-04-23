/*
 * Objetivo: Ser usado como o ponto inicial de contato para tratar todas as solicitações relacionadas.
 * 			 Ele centraliza a lógica de controle, a qual, de outro modo, poderia ser duplicada, e gerencia as atividades
 * 			 de tratamento de solicitações.
 *           
 * Deve-se aplicá-lo quando:
 * 		• Se deseja evitar que a lógica de controle seja duplicada.
 * 		• Se deseja aplicar uma lógica comum a diversas solicitações.
 * 		• Se deseja separar a lógica de processamento do sistema da visualização.
 * 		• Se deseja centralizar os pontos de acesso controlados no sistema.
 */

package padroesarquiteturais.front_controller;

public class Principal {

	public static void main(String[] args) {
		FrontController frontController = new FrontController();
		frontController.encaminhar("Fornecedor");
		System.out.println();
		frontController.encaminhar("Cliente");
	}

}
