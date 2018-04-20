package padroesarquiteturais.chain_of_responsability;

public class Classe_3 extends CadeiaDeResponsabilidade {
	
	public Classe_3(int pnLimite) {
		this.limite = pnLimite;
	}

	@Override
	protected void escrever(String psMensagem) {
		System.out.println("Classe_3: "+ psMensagem);
	}

}
