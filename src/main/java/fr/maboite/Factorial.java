package fr.maboite;

public class Factorial {
	
	public static int compute(int n) {
		if(n <= 0) {
			return 1;
		}
		
		int fact = 1;
		for(int i = 1; i <= n; i++) {
			fact*=i;
		}
		return fact;
	}
	

	public Factorial() {
		// TODO Auto-generated constructor stub
	}

}
