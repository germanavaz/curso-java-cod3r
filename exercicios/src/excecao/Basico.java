package excecao;

public class Basico {
	
	public static void main(String[] args) {
		
		try {
			System.out.println(7 / 0);
		} catch (Exception e) {
			System.out.println("Ocorreu o erro: " + e.getMessage());
			//e.printStackTrace();
		}
		
		System.out.println("fim!");
		
	}

}
