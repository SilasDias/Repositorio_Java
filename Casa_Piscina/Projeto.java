class Projeto {
	/* Calcula a área de uma casa com piscina */
	static double area(double lateral, double cquarto, double raio) {
		return (AreaCasa.area(lateral, cquarto) + AreaPiscina.area(raio));

	}

	public static void main(String[] args) {
		System.out.println(area(15, 10, 4.2));
	}
}
