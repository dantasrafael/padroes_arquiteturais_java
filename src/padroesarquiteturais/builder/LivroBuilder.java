package padroesarquiteturais.builder;

public interface LivroBuilder {

	public void buildIndice();
	public void buildPrefacio();
	public void buildIntroducao();
	public void buildCapitulos();
	public void buildGlossario();
	public Livro getLivro();
	
}
