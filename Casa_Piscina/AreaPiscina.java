class AreaPiscina {
	static final int ALVENARIA = 0;
	static final int VINIL = 1;
	static final int FIBRA = 2;
	static final int PLASTICO = 3;
	static double[] precos = { 1500, 1100, 750, 500 };
	static char[][] nomes = { { 'A', 'l', 'v', 'e', 'n', 'a', 'r', 'i', 'a' }, { 'V', 'i', 'n', 'i', 'l' },
			{ 'F', 'i', 'b', 'r', 'a' }, { 'P', 'l', 'á', 's', 't', 'i', 'c', 'o' } };

	static double area(double raio) {
		return ((raio >= 0) ? Math.PI * Math.pow(raio, 2) : -1);
	}

	static double valor(double area, int material) {
		if (material < ALVENARIA || material > PLASTICO || area < 0)
			return (-1);
		return (area * precos[material]);
	}

	public static double[][] calculaFinal(double[][] val, double[][] desc) {
		double[][] saida = new double[val.length][val[0].length];
		for (int i = 0; i < saida.length; i++) {
			for (int j = 0; j < saida[0].length; j++)
				saida[i][j] = val[i][j] * (1 - desc[i][j]);

		}
		return (saida);
	}

	public static void carregaVal(double[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 50; j <= 200; j += 50) {
				m[i][j / 50 - 1] = precos[i] * j;
			}
		}
	}

	public static void main(String[] args) {
	}
}
