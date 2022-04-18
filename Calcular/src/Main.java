import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		  Area lol = new Area();
		
		System.out.println("Escoha qual área deseja calcular");
		System.out.println();
		System.out.println("1- Quadrado");
		System.out.println("2- Triângulo");
		System.out.println("3- Retângulo");
		
		Scanner in = new Scanner(System.in);
		
		int m = in.nextInt();
		
	    if(m == 1) {
	    	
	    	System.out.println("Digite a altura");
			double h = in.nextDouble();
	    	double pog = lol.cal (h);
	    	
			
			System.out.println("O resultado eh: " + pog);
	    	
	    }
	    else if(m == 2){
	    	
	    	System.out.println("Digite a altura");
			double h = in.nextDouble();
			System.out.println("Digite a largura");
			double l = in.nextDouble();
			double pog = lol.cal (h, l, 2);
	    	
	    }
	    else if(m == 3){
	    	
	    	System.out.println("Digite a altura");
			double h = in.nextDouble();
			System.out.println("Digite a largura");
			double l = in.nextDouble();
			double pog = lol.cal (h, l);
			
			System.out.println("O resultado eh: " + pog);
	    	
	    }
			
	  	
			
			
		
		System.out.println("Digite a altura");
		double h = in.nextDouble();
		System.out.println("Digite a largura");
		double l = in.nextDouble();
		
		
		
		
		
		
		double pog = lol.cal (h);
		
		System.out.println("O resultado eh: " + pog);
		
		pog = lol.cal (h, l, 2);
		
		System.out.println("O resultado eh: " + pog);
		
		pog = lol.cal (h, l);
		
		System.out.println("O resultado eh: " + pog);

	}

}
