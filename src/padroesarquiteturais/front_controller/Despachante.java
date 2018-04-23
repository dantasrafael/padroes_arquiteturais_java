package padroesarquiteturais.front_controller;

public class Despachante {
	
	private PaginaCliente paginaCliente;
	private PaginaFornecedor paginaFornecedor;
	
	public Despachante() {
		paginaCliente = new PaginaCliente();
		paginaFornecedor = new PaginaFornecedor();
	}
	
	public void enviar(String request) {
		if (request.equalsIgnoreCase("Cliente")) {
			paginaCliente.exibir();
		} else {
			paginaFornecedor.exibir();
		}
	 }

}
