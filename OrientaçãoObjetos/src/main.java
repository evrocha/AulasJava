
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoas pessoa1 = new Pessoas();
		
		pessoa1.nome = "Margus";
		pessoa1.nume_figu = 10;
		
		//pessoa1.receber(78);
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.nume_figu);
		
		Pessoas pessoa2 = new Pessoas();
		pessoa2.nome = "Rogerio ceni";
		pessoa2.nume_figu = 20;
		
	
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.nume_figu);
		
		pessoa1.dar(1, pessoa2);
		
	}
}
