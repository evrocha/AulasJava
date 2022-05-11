
public class Circulo implements AreaCalculavel{

	
	double raio = 20;
	double pi = 3.14;
	
	
	@Override
	public void CalcularArea() {
		double r = pi*raio*raio;
		System.out.println("Valor da area da circunferencia eh: " + r);
		
	}
}
