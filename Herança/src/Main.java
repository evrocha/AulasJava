
public class Main {

	public static void main(String[] args) {
		
		Veiculo v1 = new Veiculo();
		
		v1.setAno(1990);
		v1.setMarca("Honda");
		v1.setModelo("City");
		
		v1.imprimir();
		
		v1.buzinar();
		
		Carro caru = new Carro();
		
		caru.setAno(1990);
		caru.setMarca("Vascao");
		caru.setModelo("Manchester City");
		caru.setQuatroPortas(true);
		caru.imprimir();

		Caminhao ca = new Caminhao();
		
		ca.setAno(2000);
		ca.setModelo("pog");
		
		
		
		ca.setMarca("shh nao grita");
		ca.buzinar();
		ca.imprimir();
		
		Moto moto = new Moto();
		
		moto.setAno(1990);
		moto.setMarca("Vascao");
		moto.setModelo("Manchester City");
		moto.imprimir();
		moto.buzinar();
		moto.dargrau();
		


	}

}
