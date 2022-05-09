
public class Preparador {
	
	public void prepararBebida(Bebida bebida) {
		
		System.out.println();
		System.out.println("Preparando a bebida: " + bebida.getNome());
		
		bebida.preparar();
		
		if(bebida.isAquecer()) {
			System.out.println("Aquecendo a bebida: " + bebida.getNome());
		}
		else {
			System.out.println("Colocando gelo no copo");
		}
		
		System.out.println("Bebida preparada com sucesso lol");
	}

}
