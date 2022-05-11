
public class Quadrado implements AreaCalculavel{

	double n1 = 4;
	double r;
	
	@Override
	public void CalcularArea() {
	
		r = n1 * n1;
		System.out.println("O valor da area do quadrado eh: " +r);
		
	}
}
