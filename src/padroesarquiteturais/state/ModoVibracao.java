package padroesarquiteturais.state;

public class ModoVibracao implements ModoAlerta {

	@Override
	public void alertar(Alerta alerta) {
		System.out.println("Vibrando");
	}

}
