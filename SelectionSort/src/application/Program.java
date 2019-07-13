package application;

import entities.SelectionSort;

public class Program {

	public static void main(String[] args) {
		int[] v = {9,8,4,10,6};
		
		SelectionSort.selecao(v);

		for(int el : v)
			System.out.printf(el+" ");
		System.out.println();
	}

}
