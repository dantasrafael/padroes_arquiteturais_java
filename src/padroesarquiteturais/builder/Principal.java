/*
 * Objetivo: Separar a construção de um objeto complexo da sua representação de modo que o mesmo processo de construção
 * 			 possa criar diferentes representações.
 *           
 * Deve-se aplicá-lo quando:
 * 		• O algoritmo para criação de um objeto complexo for independente das partes que compõem o objeto
 * 		  e dependendo de como elas são montadas;
 * 		• O processo de construção permitir diferentes representações para o objeto que for construído.
 */

package padroesarquiteturais.builder;

public class Principal {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("Gerando Livro Técnico:");
		LivroBuilder livroTecnicoBuilder = new LivroTecnicoBuilder();
		Grafica livroTecnicoWriter = new Grafica(livroTecnicoBuilder);
		livroTecnicoWriter.gerarLivro();
		Livro livroTecnico = livroTecnicoWriter.getLivro();
		System.out.println("Livro Técnico gerado com sucesso." + "\n\n");
		
		System.out.println("Gerando Livro de Ficção:");
		LivroBuilder livroFiccaoBuilder = new LivroFiccaoBuilder();
		Grafica livroFiccaoWriter = new Grafica(livroFiccaoBuilder);
		livroFiccaoWriter.gerarLivro();
		Livro livroFiccao = livroFiccaoWriter.getLivro();
		System.out.println("Livro de Ficção gerado com sucesso.");
	}

}
