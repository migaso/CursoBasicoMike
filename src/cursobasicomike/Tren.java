package cursobasicomike;

public class Tren {
	int vagones[][]= new int[5][2];
	String maquinista;
	int antiguedad;
	
	public Tren() { //Bob el constructor
		for(int i= 0; i<=4; i++) { //numero de vagones
				vagones[i][0] = (i+1)*10; //Cantidad de Asientos 
				vagones[i][1] = 0; //Asientos Reservados

		}
		maquinista = "anonimo";
		antiguedad = 0;
	}
	
	public Tren(String nombre, int anios ) { //Bob el constructor sobrecargado
		for(int i= 0; i<=4; i++) {
				vagones[i][0] = (i+1)*10;
				vagones[i][1] = 0;

		}
		maquinista = nombre;
		antiguedad = anios;
	}
	
	public void CompletarVagon(int vagon) {
		vagones[vagon][1] = vagones[vagon][0];
		System.out.println("el vagon "+ (vagon+1) + " ha sido completado");
	}
	
	public void meterPasajero(int vagon, int pasajeros) {
		if(vagones[vagon][1] + pasajeros > vagones[vagon][0]) {
			System.out.println("No hay tantos asientos libres en el vagon "+ (vagon+1));
		} else {
			vagones[vagon][1] += pasajeros;
			System.out.println("La reserva se ha completado");
		}
		
	}
}
