package padroesarquiteturais.factory_method;

public class FabricaAluno {

	public Aluno getPessoa(Curso poCurso, String psNome, double pnTeste, double pnProva) {
		switch (poCurso) {
			case CURSO_GRADUACAO: return new AlunoGraduacao(psNome, pnTeste, pnProva);
			case CURSO_POSGRADUACAO: return new AlunoPosGraduacao(psNome, pnTeste, pnProva); 
			default: return null;
		}
	}
	
}
