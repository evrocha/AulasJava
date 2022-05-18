import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List lista = new ArrayList();
//
//		lista.add("Mbappe");
//		lista.add(12);
//		lista.add(true);
//		
////		for(int x=0;x<lista.size(); x++) {
////		System.out.println(lista.get(0));
////		}
//		
//		for(Object bape : lista) {
//			System.out.println(bape);
//		}
//		lista.remove(0);
//		for(Object bape : lista) {
//			System.out.println(bape);
//		}
//		lista.add(0, "def");
//		for(Object bape : lista) {
//			System.out.println(bape);
//		}
//		
//		System.out.println();
//		
//		lista.set(0, "ghi");
//		for(Object bape : lista) {
//			System.out.println(bape);
//		}
//		
//		System.out.println();
//		
//		lista.clear();
//		if (lista.isEmpty()) {
//			System.out.println("Sua lista está vazia");
//		}
		
		Conta conta1 = new Conta("Agua", 60.00);
		Conta conta2 = new Conta("Luz", 160.00);
		
		List<Conta> listaDeContas = new ArrayList<Conta>(); //Apenas irá aceitar instanciar objetos do tipo "Conta"
		
		listaDeContas.add(conta1);
		listaDeContas.add(conta2);
		
		for(Conta conta : listaDeContas) {
			System.out.println(conta);
		}
		

	}

}
