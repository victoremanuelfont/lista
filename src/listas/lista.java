package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class lista {

	public static void main(String[] args) {
	
		
		//Declaração e instanciação da lista
		List<String> list = new ArrayList<>();
		
		// Para adicionar valores na lista:
		list.add("Victor");
		list.add("Miguel");
		list.add("Maria");
		list.add("Bob");
		list.add("Jacira");
		list.add("Mileide");
		list.add("Marcos");
		list.add("Aurilene");
		list.add("audiledA");
	
		//Percorrendo os valores da lista:
		for(String nome: list) {
			System.out.println(nome);
		}
		
		System.out.println();
		//Para adicionar na lista numa posição específica:
		list.add(2, "Antonio");
		
		for(String nome: list) {
			System.out.println(nome);
		}
		
		System.out.println();
		
		//Para ver o tamanho da lista
		System.out.println(list.size());
		
		//Para remover 
		list.remove("Bob"); // Remove através de comparação
		list.remove(1); // Remove por meio de posição.
		
		for(String nome: list) {
			System.out.println(nome);
		}
		System.out.println(); 
		
		//Remover todos com letra "M"
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String nome: list) {
			System.out.println(nome);
		}
		
		System.out.println();
		
		//Para encontrar a posição de um determinado valor
		System.out.println("Posição do victor = " + list.indexOf("Victor"));
		System.out.println("Posição do Antonio = " + list.indexOf("Antonio"));
		System.out.println("Posição de um valor que não existe na lista = " + list.indexOf("Miguel"));
		
		System.out.println();
		
		//Filtrar a lista com algum valor
		/*
		 * Nesse caso, será mostrado apenas o nome que começar com 'A'
		 */
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String nome: result) {
			System.out.println(nome);
		}
		
		System.out.println();

		/*
		 * Encontrar o primeiro elemento que começa com a letra 'A'. Se não encontrar, retorna null
		 */
		
		String name = list.stream().filter(x-> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}
