package cursobasicomike;
import cursobasicomike.Tren;

public class CursoBasicoMike {

	public static void main(String[] args) {
		
		Tren primero = new Tren(); //Creamos un tren
		Tren segundo = new Tren("Juan",25); 
		Lujo tercero = new Lujo("Victor",true);
		
		/*Pruebas para ocupar vagones*/
		System.out.println(primero.antiguedad); //llamamos una característica del objeto - varible del objeto
		primero.CompletarVagon(2);
		System.out.println(primero.vagones[2][1]);
		primero.meterPasajero(1, 5);
		System.out.println(primero.vagones[1][1]);
		
		/* 
		 * Aquí se imprime la herencia de la clase Tren (parent) con la clase Lujo (child),
		 * esto nos índica que la clase Lujo ha heredado los metodos de la clase
		 * Tren y ¡no viceversa! En otras palabras, Tren no puede hacer uso de los metodos de Lujo.
		 */
		System.out.println(tercero.camarero);
		tercero.meterPasajero(1, 9);
		System.out.println(tercero.vagones[1][1]); 
		tercero.statusBar(true);
	}

}
