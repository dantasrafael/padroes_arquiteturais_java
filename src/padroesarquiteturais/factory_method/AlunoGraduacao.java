package padroesarquiteturais.factory_method;

public class AlunoGraduacao extends Aluno {
	
	public AlunoGraduacao(String psNome, double pnTeste, double pnProva) {
		super(psNome, pnTeste, pnProva);
	}

	@Override
	public double getMedia() {
		return (getTeste() + getProva())/2;
	}

}
