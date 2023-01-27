package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		
		/*
		 *.add() lançará uma exceção caso a fila esteja cheia.
		 *.offer() retorna falso caso a fila esteja cheia.
		 *A diferença no comportamento ocorre quando a fila está cheia
		 */
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.add("Gui");
		
		// Peek e element - obter o próximo elemento da fila, SEM REMOVER
		//A diferença no comportamento ocorre quando a fila está vazia
		System.out.println(fila.peek()); // retorna null quando vazio
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lança exceção quando vazio
		System.out.println(fila.element());
		
		// fila.size();
		// fila.clear();
		//fila.isEmpty();
		//fila.contains();
		
		//chama o próximo da fila, já removendo
		//quando a lista ta vazia - retorna null
		System.out.println(fila.poll());
		
		// remove da lista 
		//quando a lista ta vazia - retorna exceção
		System.out.println(fila.remove());
	}

}
