package Futbolmaniakos;

public class RedSocial {

		String nombre;
		String  color;
		int usuarios;
		
		public RedSocial () {}
		public RedSocial (String nombre,String color, int usuarios) {
			this.nombre = nombre;
			this.color = color;
			this.usuarios = usuarios;
			
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public void setUsuarioss(int usuarios) {
			this.usuarios = usuarios;
		}
		
	    public void mostrarRedSocial(){
	        System.out.println("Red social mostrandose...");
	        
	    }
	    public void seguirRedSocial(){
	        System.out.println("Siguiendo...");
	    }
	}
