package padroesarquiteturais.chain_of_responsability;

public class Classe_1 extends CadeiaDeResponsabilidade {
	
	public Classe_1(int pnLimite) {
		this.limite = pnLimite;
	}

	@Override
	protected void escrever(String psMensagem) {
		System.out.println("Classe_1: "+ psMensagem);
	}

}
