package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		/*
		 * instanciar duas datas = objeto 
		 */
		
		Data d1 = new Data();
		Data d2 = new Data(25, 2, 1928);
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		
	}

}
