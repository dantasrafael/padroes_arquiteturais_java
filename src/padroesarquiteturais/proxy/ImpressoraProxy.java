package padroesarquiteturais.proxy;

public class ImpressoraProxy implements Impressora {
	
	private ImpressoraReal impressoraReal;
	private String nomeArquivo;
	
	public ImpressoraProxy(String psNomeArquivo) {
		this.nomeArquivo = psNomeArquivo;
	}

	@Override
	public void imprimir() {
		if (impressoraReal == null) {
			impressoraReal = new ImpressoraReal(nomeArquivo);
		}
		impressoraReal.imprimir();
	}

}
