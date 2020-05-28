package Futbolmaniakos;

public class Clasificacion {

		String equipos;
		int  posicion;
		int  puntos;
		
		public Clasificacion () {}
		public Clasificacion (String equipos, int posicion, int puntos) {
			this.equipos = equipos;
			this.posicion = posicion;
			this.puntos = puntos;
			
		}
		
		public void setEquipos(String equipos) {
			this.equipos = equipos;
		}
		public void setPosicion(int posicion) {
			this.posicion = posicion;
		}
		public void setPuntos(int puntos) {
			this.puntos = puntos;
		}
		
	    public void mostrarTabla(){
	        System.out.println("Tabla mostrada...");
	        
	    }
	    public void cambiarPosicion(){
	        System.out.println("Posicion cambiada");
	    }
	}
