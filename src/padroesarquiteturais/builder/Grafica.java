package padroesarquiteturais.builder;

public class Grafica {

	LivroBuilder livroBuilder;
	
	public Grafica(LivroBuilder bookBuilder) {
		super();
		this.livroBuilder = bookBuilder;
	}
	
	public Livro getLivro() {
		return this.livroBuilder.getLivro();
	}
	
	public void gerarLivro() {
		this.livroBuilder.buildIndice();
		this.livroBuilder.buildPrefacio();
		this.livroBuilder.buildIntroducao();
		this.livroBuilder.buildCapitulos();
		this.livroBuilder.buildGlossario();
	}
	
}
