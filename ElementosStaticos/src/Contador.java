
public class Contador {
	
	
	
//	public Contador() {
//		
//		this.valor = 1;
//	}

	private static int valor;
	
	public static void incrementar() {
		valor++;
	}

	public static int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
		
	}
	static {
		valor = 1;
	}
	
	
	
	

}
