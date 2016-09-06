package py.edu.uaa.pooj.operadores.test;

public class OperacionesMatematicas {
int[] arreglo={1,5,3,9,4,7,15,16,18,20};
int max=0, min=0, z=0;

// PRACTICA
	public int encontrarMinimo() {
		for (int i = 0; i < arreglo.length; i++) {
			int num = arreglo[i];
			if(num < min){
				min=arreglo[i];
			}
		}
		return min;
	}

	// PRACTICA
	public int encontrarMaximo() {
		// TODO "Encontrar el valor maximo de un array de enteros"
		for (int i = 0; i < arreglo.length; i++) {
			int num = arreglo[i];
			if(num > max){
				max=arreglo[i];
			}
			
		}
		return max;
	}

	// PRACTICA
	public int filtrarImpares() {
		// TODO
		// "En base a un array de enteros recibidos como parametros, filtrar solamente los numeros impares"
		for(int i=0; i< arreglo.length; i++){
			int num=arreglo[i];
			if(num / 2 == 0){
			}
			else{
			arreglo[i]= z;
				
			}	
		}
		return z;
	}
	
	public static void main(String[] args) {
		OperacionesMatematicas Op= new OperacionesMatematicas();
		Op.encontrarMaximo();
		Op.encontrarMinimo();
		Op.filtrarImpares();
	}

}
