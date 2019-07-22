package entities;

public class Insert {
	
	public Insert() {
		
	}
		
	public static void insercao(int[] v) {
		for(int i=1; i < v.length;i++) {
			int aux = v[i];
			int j = i;
			while ((j > 0) && (aux < v[j-1])) {
				v[j] = v[j-1];
				j--;
			}
			v[j] = aux;
		}
	}

}
