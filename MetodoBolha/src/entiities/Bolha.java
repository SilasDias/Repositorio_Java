package entiities;

public class Bolha {

	public static void bolha(int[] v) {
		for (int ult = v.length - 1; ult > 0; ult--) {
			for (int i = 0; i < ult; i++) {
				if (v[i] > v[i + 1]) {
					int aux = v[i];
					v[i] = v[i + 1];
					v[i + 1] = aux;
				}
			}
		}
	}

}
