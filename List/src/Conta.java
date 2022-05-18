
public class Conta {

	String conta;
	double valor;
	
	public Conta(String conta, double valor) {
		this.conta = conta;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Conta [conta=" + conta + ", valor=" + valor + "]";
	}

	
}
