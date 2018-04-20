package padroesarquiteturais.chain_of_responsability;

public class Classe_2 extends CadeiaDeResponsabilidade {
	
	public Classe_2(int pnLimite) {
		this.limite = pnLimite;
	}

	@Override
	protected void escrever(String psMensagem) {
		System.out.println("Classe_2: "+ psMensagem);
	}

}
