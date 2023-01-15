package fundamentos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		
		Integer num1 = 1000; //transformou o primitivo em objeto 
		System.out.println(num1.toString().length()); //passou de int pra string e mediu ele
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length()); //aqui usou diretamente o tipo para transformar um primitivo
		
	}

}
