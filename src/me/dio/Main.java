package me.dio;

import java.util.ArrayList;
import java.util.List;

// EXERCICIO FINAL

	// 1- Crie uma lista e execute as seguintes opera��es:
/* Adicione 5 nomes: Juliana, Pedro, Carlos, larissa e Jo�o
 * Navegue na lista exibindo cada nome no console.
 * Substitua o nome Carlos por Roberto.
 * Retorne o nome da posi��o 1.
 * Remova o nome da posi��o 4.
 * Remova o nome Jo�o.
 * Retorne a quantidade de itens na lista.
 * Verifique se o nome Juliano existe na lista.
 * Crie uma nova lista com os nomes: Ismael e Rodrigo. 
 * Adicione todos os itens da nova lista na primeira lista criada
 * Ordene a lista em ordem alfab�tica
 * Verifique se a lista est� vazia
 */


public class Main {
	
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>() {
			private static final long serialVersionUID = 1L;

		{
	// Adicione 5 nomes: Juliana, Pedro, Carlos, larissa e Jo�o
			add("Juliana");
			add("Pedro");
			add("Carlos");
			add("Larissa");
			add("Jo�o");
		}};
		
	//  Navegue na lista exibindo cada nome no console.
		
		System.out.println(nomes.toString());
		
	// Substitua o nome Carlos por Roberto.
		
		nomes.set(2,"Roberto");
		
		System.out.println(nomes.toString());
		
	// Retorne o nome da posi��o 1.
		
		System.out.println(nomes.get(1));
		
	//Remova o nome da posi��o 4.
		
		nomes.remove(4);
		System.out.println(nomes.toString());
		
	// Remova o nome Jo�o.
		nomes.add("Jo�o");
		System.out.println(nomes.toString());
		nomes.remove("Jo�o");
		System.out.println(nomes.toString());
		
	// Retorne a quantidade de itens na lista. 
		System.out.println(nomes.size());
		
	//Verifique se o nome Juliano existe na lista.
		System.out.println(nomes.contains("Juliano"));
		
	// Crie uma nova lista com os nomes Ismael e Rodrigo
		List<String> nomes1 = new ArrayList<>() {
			private static final long serialVersionUID = 1L;
            { add("Ismael"); add("Rodrigo");}};
		
		System.out.println(nomes.toString());
		System.out.println(nomes1.toString());
		
	// Adicione todos os itens da nova lista na primeira lista criada
		
		List<String> novaLista = new ArrayList<String>(nomes.size()+ nomes1.size());
		novaLista.addAll(nomes);
		novaLista.addAll(nomes1);
		
		System.out.println(novaLista.toString());
		
	// Ordene a lista em ordem alfab�tica
		novaLista.sort(null);
		System.out.println(novaLista.toString());
    // Verifique se a lista est� vazia
		
		System.out.println(novaLista.isEmpty());
	}

}
