/*
 * Objetivo: Definir uma interface para criar um objeto, embora deixe as subclasses decidirem qual classe instanciar.
 * 			 O padrão Factory Method permite a uma classe postergar a instanciação às subclasses.
 *           
 * Deve-se aplicá-lo quando:
 * 		• Uma classe não puder antecipar a classe de objetos que for criada;
 * 		• Uma classe quiser que suas subclasses especifiquem os objetos que ela cria;
 * 		• As classes delegarem responsabilidades para uma dentre várias subclasses auxiliares,
 * 		  e se deseja localizar o conhecimento de qual subclasse auxiliar implementa a delegação.
 */

package padroesarquiteturais.factory_method;

public class Principal {

	public static void main(String[] args) {
		FabricaAluno fabricaAluno = new FabricaAluno();
		Aluno aluno = fabricaAluno.getPessoa(Curso.CURSO_GRADUACAO, "Fulano de Tal", 10, 9);
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Média: " + aluno.getMedia());
	}

}
