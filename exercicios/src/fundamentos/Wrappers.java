package fundamentos;

public class Wrappers {
	
	public static void main(String[] args) {
		
		//Wrappers são a versão objeto dos tipos primitivos;
		//versão orientada a objetos dos tipos primitivos;
		
		//byte 
		Byte b = 100;
		
		//short
		Short s = 1000;
		
		//int 
		Integer i = 10000;
		Integer ii = Integer.parseInt("1000");
		
		//long
		Long l = 100000000000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(ii);
		System.out.println(i * 3);
		System.out.println(l / 4);
		
		//boolean 
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		//Char
		Character c = '#';
		System.out.println(c.charValue());
		
	}

}
