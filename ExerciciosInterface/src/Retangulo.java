
public class Retangulo implements AreaCalculavel{

	
	
	double b = 30;
	double h = 10;
	double r;
	
	
	@Override
	public void CalcularArea() {
		
		r = b * h;
		System.out.println("O valor da area do retangulo eh: "+r);
		
		
	}

}
