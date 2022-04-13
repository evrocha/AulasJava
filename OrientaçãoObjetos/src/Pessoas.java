
public class Pessoas {

	String nome;
	int nume_figu;

	void receber(int nume_figu, Pessoas pessoa) {
		pessoa.nume_figu += nume_figu;

	}

	void dar(int nume_figu, Pessoas pessoa) {

		if (nume_figu < pessoa.nume_figu) {

			this.nume_figu -= nume_figu;
			pessoa.receber(nume_figu, pessoa);

			System.out.println(this.nome);
			System.out.println(this.nume_figu);

			System.out.println(pessoa.nome);
			System.out.println(pessoa.nume_figu);

		} else {

			System.out.println("Você não essa quatidade de figurinhas.");
		}

	}
}
