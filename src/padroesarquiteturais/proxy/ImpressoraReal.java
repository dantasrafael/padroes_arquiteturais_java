package padroesarquiteturais.proxy;

public class ImpressoraReal implements Impressora {
	
	private String nomeArquivo;
	
	public ImpressoraReal(String psNomeArquivo) {
		this.nomeArquivo = psNomeArquivo;
		this.carregar(psNomeArquivo);
	}

	@Override
	public void imprimir() {
		System.out.println("Imprimindo " + this.nomeArquivo + "\n");
		
	}
	
	public void carregar(String psNomeArquivo) {
		System.out.println("Carregando " + psNomeArquivo);
		
	}	

}
