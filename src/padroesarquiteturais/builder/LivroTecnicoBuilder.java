package padroesarquiteturais.builder;

public class LivroTecnicoBuilder implements LivroBuilder {
	
	private Livro livro;
	
	public LivroTecnicoBuilder() {
		livro = new Livro();
	}

	@Override
	public void buildIndice() {
		System.out.println("Montando índice");
		livro.setIndice("Índice livro técnico");
	}

	@Override
	public void buildPrefacio() {
		System.out.println("Montando prefácio");
		livro.setIndice("Prefácio livro técnico");
	}

	@Override
	public void buildIntroducao() {
		System.out.println("Montando Introdução");
		livro.setIndice("Introdução livro técnico");
	}

	@Override
	public void buildCapitulos() {
		System.out.println("Montando capítulos");
		livro.setCapitulos("Capítulos livro técnico");
	}

	@Override
	public void buildGlossario() {
		System.out.println("Montando Glossário");
		livro.setGlossario("Glossário livro técnico");
	}

	@Override
	public Livro getLivro() {
		return livro;
	}

}
