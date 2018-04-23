package padroesarquiteturais.state;

public class ModoSonoro implements ModoAlerta {

	@Override
	public void alertar(Alerta alerta) {
		System.out.println("Tocando Música");
	}

}
