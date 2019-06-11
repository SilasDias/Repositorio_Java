/* Programa para calcular a área de uma
casa (e seus cômodos) de 3 cômodos:
uma sala de 10X10m, um banheiro e um
quarto de 5X7m cada.*/

class AreaCasa {
	/* valor do metro quadrado da casa */
	static double valorM2 = 1500;

	/* Calcula a área da casa */
	static double area(double lateral, double cquarto) {
		float areat = -1; // área total
		if (lateral >= 0 && cquarto >= 0) {
			areat = (float) (lateral * lateral);
			areat += cquarto * lateral;
		}
		return (areat);
	}

	/* Calcula o valor total da casa */
	static double valor(double area) {
		if (area >= 0)
			return (valorM2 * area);
		return (-1);
	}

	public static void main(String[] args) {
	}
}

