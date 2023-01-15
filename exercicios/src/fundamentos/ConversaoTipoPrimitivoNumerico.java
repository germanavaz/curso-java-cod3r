package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; //conversão implícita
		System.out.println(a);
		
		//float b = 1.0F; ou 
		float b = (float) 1.268169265; //conversão explícita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; //explícita (CAST)
		System.out.println(d);
	
	}

}
