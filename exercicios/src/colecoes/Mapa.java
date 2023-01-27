package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberta"); // incluiu
		// usuarios.put(1, "Ricardo"); // alterou pq tem a mesma chave; não pode ter repteição
		usuarios.put(252, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(414524, "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet()); // chave e valor
		
		System.out.println(usuarios.containsKey(3));
		System.out.println(usuarios.containsValue("Rebeca"));
		
		System.out.println(usuarios.get(252));
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " -> ");
			System.out.println(registro.getValue());
		}
	}

}
