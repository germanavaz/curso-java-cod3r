package streams;

import java.util.*;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
		
		/*método tradicional
		for(int i=0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		*/
		
		//foreach
		System.out.println("Usando o foreach...");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando Iterator...");
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nUsando Stream...");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println); //laço interno
		
		
	}

}
