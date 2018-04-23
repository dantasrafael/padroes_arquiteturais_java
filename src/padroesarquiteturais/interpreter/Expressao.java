package padroesarquiteturais.interpreter;

public class Expressao implements InterfaceExpressao {
	
	private String texto;
	
	public Expressao(String psTexto) {
		this.texto = psTexto;
	}

	@Override
	public boolean interpretar(String psTexto) {
		if (psTexto.contains(this.texto)) {
			return true;
		}
		return false;	
	}

}
