import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		
		List<Pessoa> listaDePessoas = new ArrayList<Pessoa>();
		
		for(int i = 0; i < 3; i++) {
			Pessoa conta = new Pessoa();
			System.out.println("Qual seu nome?");
			conta.nome = in.next();
			
			listaDePessoas.add(conta);
		}
		
		for(Pessoa lol : listaDePessoas) {
			System.out.println(lol.nome);
	}
}
}