package cursobasicomike;
import cursobasicomike.Tren;

public class CursoBasicoMike {

	public static void main(String[] args) {
		
		Tren primero = new Tren(); //Creamos un tren
		Tren segundo = new Tren("Juan",25); 
		System.out.println(primero.antiguedad); //llamamos una característica del objeto
		primero.CompletarVagon(2);
		System.out.println(primero.vagones[2][1]);
		primero.meterPasajero(1, 5);
		primero.meterPasajero(1, 3);
		System.out.println(primero.vagones[1][1]);
	}

}
