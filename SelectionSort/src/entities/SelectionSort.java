package entities;

public class SelectionSort {
	
	public static int posMenorEl(int[] v, int inicio) {
		int posMenor = -1;
		if((v!=null) && (inicio >= 0) && (inicio < v.length)) {
			posMenor = inicio;
			for(int i=inicio+1; i < v.length;i++)
				if(v[i] < v[posMenor]) posMenor = i;
		}
		return(posMenor);
	}
	
	public static void selecao(int[] v) {
		for(int i=0; i < v.length-1; i++) {
			int posMenor = posMenorEl(v,i);
			if(v[posMenor] < v[i]) {
				int aux = v[i];
				v[i] = v[posMenor];
				v[posMenor] = aux;
			}
		}

	}

}
