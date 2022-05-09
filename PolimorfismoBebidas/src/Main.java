
public class Main {

	public static void main(String[] args) {
		
		Preparador preparador = new Preparador();
		
		LeiteQuente LQ = new LeiteQuente();
		preparador.prepararBebida(LQ);
		
		Refrigerante refri = new Refrigerante();
		
		preparador.prepararBebida(refri);
	}

	

}
