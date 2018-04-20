package padroesarquiteturais.builder;

public class LivroFiccaoBuilder implements LivroBuilder {
	
	private Livro livro;
	
	public LivroFiccaoBuilder() {
		livro = new Livro();
	}

	@Override
	public void buildIndice() {
		System.out.println("Montando índice");
		livro.setIndice("Índice livro ficção");
	}

	@Override
	public void buildPrefacio() {
		System.out.println("Montando prefácio");
		livro.setIndice("Prefácio livro ficção");
	}

	@Override
	public void buildIntroducao() {
		System.out.println("Montando Introdução");
		livro.setIndice("Introdução livro ficção");
	}

	@Override
	public void buildCapitulos() {
		System.out.println("Montando capítulos");
		livro.setCapitulos("Capítulos livro ficção");
	}

	@Override
	public void buildGlossario() {
		System.out.println("Montando Glossário");
		livro.setGlossario("Glossário livro ficção");
	}

	@Override
	public Livro getLivro() {
		return livro;
	}

}
