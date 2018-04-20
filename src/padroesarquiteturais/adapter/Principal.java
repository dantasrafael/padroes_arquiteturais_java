/*
 * Objetivo: Converter a interface de uma classe em outra interface esperada pelos clientes.
 * 			 O Adapter permite que certas classes trabalhem em conjunto, pois de outra forma seria impossível, devido às suas interfaces incompatíveis.
 *           
 * Deve-se aplicá-lo quando:
 * 		• Quiser usar uma classe existente, mas sua interface não corresponde à interface de que necessita;
 * 		• Quiser criar uma classe reutilizável que coopere com classes não relacionadas ou não previstas, ou seja,
 * 		  classes que não necessariamente tenham interfaces compatíveis;
 * 		• (somente para adaptadores de objetos) Precisar usar várias subclasses existentes, porém,
 * 		  for impraticável adaptar essas interfaces criando subclasses para cada uma. Um Adaptor de objeto pode adaptar a interface da sua classe mãe. 
 */

package padroesarquiteturais.adapter;

public class Principal {

	public static void main(String[] args) {
		CarteiraMotorista_B carteiraMotorista_B = new CarteiraMotorista_B();
		CarteiraMotorista_D carteiraMotorista_D = new CarteiraMotorista_D();
		CarteiraAdapter carteiraAdapter = new CarteiraAdapter(carteiraMotorista_D);
		carteiraAdapter.setCategoria(carteiraMotorista_B.getCategoria());
		
		System.out.println(carteiraAdapter.getCategoria());
	}

}
