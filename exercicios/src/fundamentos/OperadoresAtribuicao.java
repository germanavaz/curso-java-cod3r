package fundamentos;

public class OperadoresAtribuicao {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; // c = c + b
		c -= a; // c = c - a 
		c *= b; // c = c * b
		c /= 3; // c = c / 3
		c %= 2; // c = c % 2 - pode dar 0 ou 1 (par ou impar)
		
		System.out.println(c);
	}

}
