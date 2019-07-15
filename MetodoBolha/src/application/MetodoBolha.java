package application;

import entiities.Bolha;

public class MetodoBolha {

	public static void main(String[] args) {
		int[] v = {55,0,-78,-4,32,200,52,63,69,125};
		Bolha.bolha(v);
		for (int el : v)
		System.out.print(el+" ");
		System.out.println();
		}

}

