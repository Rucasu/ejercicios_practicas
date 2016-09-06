package py.edu.uaa.pooj.operadores;

public class BucleInfinito {

	// PRACTICA
	public void bucleInfinito() {
		//TODO "Crear un bucle infinito que muestre un mensaje 
		//en consola diciendo "Estudiar mucho para el primer parcial ;)"
		int x=0;
		while (x<10) {
			System.out.println("Estudiar mucho para el primer parcial..!!");
		}
	}
	public static void main(String[] args) {
		BucleInfinito bi = new BucleInfinito();
		bi.bucleInfinito();
	}
}
