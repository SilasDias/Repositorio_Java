package application;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Marco");	//inserir na posição 2 o elemento 'Marco'
		
		System.out.println(list.size());	//Tamanho da lista
		
		for(String x : list) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("________________________________________________________");
		
		//list.remove("Ana");	//Remove um elemento da lista, so com a descrição.
		//list.remove(1);	//Remove o elemento da posição indicada.
		list.removeIf(x -> x.charAt(0) == 'M');	//Função predicada chamada lambda.
		
		System.out.println();
		for(String x : list) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("________________________________________________________");
		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));	//Acha a posicãp do elemento chamado.
		
		System.out.println("Index of Marco: " + list.indexOf("Marco"));	//Chamando um elemento que não existe retorna negativo
		
		System.out.println();
		System.out.println("________________________________________________________");
		ArrayList<String> resultado = (ArrayList<String>) list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		// Stream e filter faz um filtro tornando somente elemento com o predicado indicado.
		for(String x : resultado) {
			System.out.print(x+" ");
		}
		
		System.out.println();
		System.out.println("________________________________________________________");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);  //Encontra o primeiro elemento com a letra 'A' se não achar retorna null
		System.out.println(name);
		
	}

}
