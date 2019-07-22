package application;

import entities.Insert;

public class InsertSort {

	public static void main(String[] args) {
		
		int[] v = {9,8,4,10,6};
		
		Insert.insercao(v);

		for(int el : v)
			System.out.printf(el+" ");
		System.out.println();

	}

}
