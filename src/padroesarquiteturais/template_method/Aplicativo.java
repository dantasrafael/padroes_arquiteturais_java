package padroesarquiteturais.template_method;

public abstract class Aplicativo {
	
	public final void gerar() {
		 obterFonte();
		 compilar();
	}

	protected void compilar() {}

	protected void obterFonte() {}

}
