package controle;

public class DesafioFor {
	
	public static void main(String[] args) {
		
		String valor = "o";
		for (int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "o";
		}
		
		for (String v = "#"; !v.equals("#####"); v += "#") {
			System.out.println(v);
		}
	}

}
