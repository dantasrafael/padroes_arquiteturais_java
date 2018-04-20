/*
 * Objetivo: Fornecer um objeto representante, ou um marcador de outro objeto, para controlar o acesso ao mesmo.
 *           
 * Deve-se aplicá-lo quando:
 * 		• A aplicação utilizar um grande número de objetos.
 * 		• Um remote proxy fornecer um representante local para um objeto num espaço de endereçamento diferente.
 * 		• Um virtual proxy criar objetos caros sob demanda.
 * 		• Um protection proxy controlar o acesso ao objeto original.
 * 		• Um smart reference for um substituto para um simples pointer que executa ações adicionais
 * 		  quando um objeto é acessado.
 */

package padroesarquiteturais.proxy;

public class Principal {

	public static void main(String[] args) {
		Impressora impressora = new ImpressoraProxy("Arquivo.doc");
		
		System.out.println("Documento sendo carregado do disco");
		impressora.imprimir();
		System.out.println("Documento não sendo carregado do disco");
		impressora.imprimir();
	}

}
