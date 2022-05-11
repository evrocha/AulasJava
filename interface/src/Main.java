
public class Main {

	public static void main(String[] args) {

		Rota rota = new Rota();
		Ferrari ferrari = new Ferrari();
		
		rota.ir(ferrari);
		
		Fusca fusca = new Fusca();
		rota.ir(fusca);
		
		Vendedor vendedor = new Vendedor();
		Apartamento apartamento = new Apartamento();
		
		vendedor.MostrarPreco(apartamento);
		vendedor.MostrarPreco(ferrari);
	}

}
