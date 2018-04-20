package padroesarquiteturais.chain_of_responsability;

public abstract class CadeiaDeResponsabilidade {
	
	public static int UM = 1;
	public static int DOIS = 2;
	public static int TRES = 3;
	protected int limite;
	protected CadeiaDeResponsabilidade proximo;
	
	public void setProxima(CadeiaDeResponsabilidade poCadeia) {
		this.proximo = poCadeia;
	}
	
	public void setMensagem(String psMensagem, int pnPrioridade) {
		if (pnPrioridade <= this.limite) {
			this.escrever(psMensagem);
		}
		if (this.proximo != null) {
			this.proximo.setMensagem(psMensagem, pnPrioridade);
		}
	}
	
	protected abstract void escrever(String psMensagem);

}
