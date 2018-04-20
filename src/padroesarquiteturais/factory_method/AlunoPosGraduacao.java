package padroesarquiteturais.factory_method;

public class AlunoPosGraduacao extends Aluno {
	
	public AlunoPosGraduacao(String psNome, double pnTeste, double pnProva) {
		super(psNome, pnTeste, pnProva);
	}

	@Override
	public double getMedia() {
		return (getTeste() + (getProva()*2))/3;
	}

}
