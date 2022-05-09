
public class Main {

	public static void main(String[] args) {
		
//		Animal ani = new Cachorro();
//		
//		ani.falar();
//		
//		Animal lol = new Gato();
//		
//		lol.falar();
		
		Gato gato = new Gato();
		Cachorro cachorro = new Cachorro();
		
		falar(gato);
		falar (cachorro);
		
	}
	
	public static void falar(Animal a) {
		a.falar();
		
		if (a instanceof Cachorro) {
			Cachorro c = (Cachorro)a;
			c.morder();
			
		}
		 
	}

}

