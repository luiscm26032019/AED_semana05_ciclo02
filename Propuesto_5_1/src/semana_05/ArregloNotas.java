package semana_05;

public class ArregloNotas {
	
	
	private int [] nota = {11, 10, 16, 18, 15, 13, 20, 12, 19, 17};
	
	//Constructor que no hace nada
	public ArregloNotas() {
	}
	
	//Operaciones públicas básicas
	public int tamanio() {
		return nota.length;
	}
	
	public int obtener(int i) {
		return nota[i];
	}
	
	public double notaPromedio() {
		double suma = 0;
		for(int i=0; i<tamanio(); i++) {
			suma += nota[i];
		}
		return suma/tamanio();
	}
	
	public double notaMayor() {
		double mayor=0;
		for(int i=0; i<tamanio(); i++) {
			if(mayor < nota[i]) {
				mayor = nota[i];
			}
		}
		return mayor;
	}
	
	public double notaMenor() {
		double menor=100;
		for(int i=tamanio()-1; i>=0; i--) {
			if(menor > nota[i]) {
				menor = nota[i];
			}
		}
		return menor;
	}
	
	public int cantNotasAprobatorias() {
		int cont=0;
		for(int i=0; i<tamanio(); i++) {
			if(nota[i]>=13) {
				cont++;
			}
		}
		return cont;
	}
	
	public int cantNotasDesaprobatorias() {
		int cont=0;
		for(int i=0; i<tamanio(); i++) {
			if(nota[i]<13) {
				cont++;
			}
		}
		return cont;
	}
	
	public int cantNotasMayoresA15() {
		int cont=0;
		for(int i=0; i<tamanio(); i++) {
			if(nota[i]>15) {
				cont++;
			}
		}
		return cont;
	}
	
	public int posPrimeraNotaAprobatoria() {
		int cont=0;
		for(int i=0; i<tamanio(); i++) {
			if(nota[i]>=13) {
				cont++;
			}
			if(cont == 1) {
				return i;
			}
		}
		return -1;
	}
	
	public int posPenultimaNotaDesaprobatoria() {
		int cont=0;
		for(int i=tamanio()-1; i>=0; i--) {
			if(nota[i]<13) {
				cont++;
			}
			if(cont==2) {
				return i;
			}
		}
		return -1;
	}
	
	public double generarNotas() {
		return aleatorio(0,20);
	}
	
	private double aleatorio(double min, double max) {
		return (double) ((max - min + 1) * Math.random()) + min;
	}
}
