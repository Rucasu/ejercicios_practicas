package py.edu.uaa.pooj.operadores.test;

public class TestCadenasIteradores {

	/*
	 * metodo que concatena todas las palabras almacenadas en el array de String recibido
	 * como parametro, agregando un espacio en blanco despues de cada palabra
	 */
	
	public String[] concatenarCadenas(String[] arrayString){ 
		
		for (int i = 0; i < arrayString.length; i++) {
			System.out.print(arrayString);
			System.out.print("--------");
		}
		return arrayString;
	}
	
		//TODO: "concatenar las palabras contenidas en el array recibido como parametro "
		
							
	public static void main(String[] args) {
		String[] vNombres = { "Juan", "Lorena", "Jose", "Patricia" };
		TestCadenasIteradores iC = new TestCadenasIteradores();
		iC.concatenarCadenas(vNombres);
		
	}
}
