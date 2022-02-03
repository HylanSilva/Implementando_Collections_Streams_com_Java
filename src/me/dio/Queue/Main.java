package me.dio.Queue;

 // # Exercicio Final Queue

/*	Adicione 5 nomes: Julia, Pedro, Carlos, Larissa e Jo�o.
 *  Navegue na fila exibindo cada nome no console.
 *  Retorne o primeiro item da fila, sem remove-lo.
 *  Retorne o primeiro item da fila, removendo o mesmo.
 *  Adicione um novo nome: Daniel. e verifique a posi��o que o mesmo assumiu na fila.
 *  Retorne o tamanho da lista.
 *  Verifique se a lista est� vazia.
 *  Vercifique se o nome Carlos est� na lista.
 * */



import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
	
		// Adicione 5 nomes: Julia, Pedro, Carlos, Larissa e Jo�o.
		Queue<String> fila = new LinkedList<>() {
			private static final long serialVersionUID = 1L;
		{
			add("Julia");
			add("Pedro");
			add("Carlos");
			add("Larissa");
			add("Jo�o");
		}};
	//  Navegue na fila exibindo cada nome no console.
		System.out.println(fila);
	// 	Retorne o primeiro item da fila, sem remove-lo.
		System.out.println(fila.peek());
	//  Retorne o primeiro item da fila, removendo o mesmo.
		System.out.println(fila.poll());
		System.out.println(fila);
		
	//  Adicione um novo nome: Daniel. e verifique a posi��o que o mesmo assumiu na fila.
		
		fila.add("Daniel");
		System.out.println(fila);
	//  Retorne o tamanho da lista.
		System.out.println(fila.size());
		
	// Verifique se a lista est� vazia
		System.out.println(fila.isEmpty());
	// Verifique se a lista cont�m o nome Carlos
		
		System.out.println(fila.contains("Carlos"));
	}

}
