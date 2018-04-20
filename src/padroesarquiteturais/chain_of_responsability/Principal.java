/*
 * Objetivo: Evitar o acoplamento do remetente de uma solicitação ao seu destinatário,
 * 			 dando a mais de um objeto a chance de tratar a solicitação, ou seja,
 * 			 encadeia os objetos receptores e passa a solicitação ao longo da cadeia até que um objeto a trate.
 *           
 * Deve-se aplicá-lo quando:
 * 		• Mais de um objeto pode tratar uma solicitação e o objeto que o tratará não é conhecido a priori.
 * 		  O objeto que trata a solicitação deve ser escolhido automaticamente.
 * 		• Quiser emitir uma solicitação para um dentre vários objetos, sem especificar explicitamente o receptor.
 * 		• O conjunto de objetos que pode tratar uma solicitação deverá ser especificado dinamicamente.
 */

package padroesarquiteturais.chain_of_responsability;

public class Principal {
	
	private static CadeiaDeResponsabilidade criarCadeiaDeResponsabilidade() {
		CadeiaDeResponsabilidade cadeia_1 = new Classe_1(CadeiaDeResponsabilidade.TRES);
		CadeiaDeResponsabilidade cadeia_2 = new Classe_2(CadeiaDeResponsabilidade.DOIS);
		CadeiaDeResponsabilidade cadeia_3 = new Classe_3(CadeiaDeResponsabilidade.UM);
		
		cadeia_1.setProxima(cadeia_2);
		cadeia_2.setProxima(cadeia_3);
		return cadeia_1;
	}

	public static void main(String[] args) {
		CadeiaDeResponsabilidade cadeia = criarCadeiaDeResponsabilidade();
		cadeia.setMensagem("Nível 3", CadeiaDeResponsabilidade.TRES);
		cadeia.setMensagem("Nível 2", CadeiaDeResponsabilidade.DOIS);
		cadeia.setMensagem("Nível 1", CadeiaDeResponsabilidade.UM);
	}

}
