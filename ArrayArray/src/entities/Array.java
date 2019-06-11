package entities;

public class Array {
	/*
	 * Carrega os valores das piscinas na matriz de área X material
	 */
	public static void carregaVal(double[][] m) {
		for (int i = 0; i < m.length; i++) { // linhas (material)
			for (int j = 50; j <= 200; j += 50) { // Colunas (areas)
				m[i][j / 50 - 1] = precos[i] * j;
			}
		}
	}

}

