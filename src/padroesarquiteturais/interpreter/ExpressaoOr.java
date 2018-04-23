package padroesarquiteturais.interpreter;

public class ExpressaoOr implements InterfaceExpressao {
	
	private InterfaceExpressao expressao1 = null;
	private InterfaceExpressao expressao2 = null;
	
	public ExpressaoOr(InterfaceExpressao poExpressao1, InterfaceExpressao poExpressao2) {
		this.expressao1 = poExpressao1;
		this.expressao2 = poExpressao2;
	}

	@Override
	public boolean interpretar(String psTexto) {
		return expressao1.interpretar(psTexto) || expressao2.interpretar(psTexto);
	}

}
