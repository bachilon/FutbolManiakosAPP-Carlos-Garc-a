package Futbolmaniakos;

public class MenuPrincipal {

		String nombre;
		int  interacciones;
		int  usuariosOnline;
		
		public MenuPrincipal () {}
		public MenuPrincipal (String nombre,int interacciones, int usuariosOnline) {
			this.nombre = nombre;
			this.interacciones = interacciones;
			this.usuariosOnline = usuariosOnline;
			
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public void setInteracciones(int interacciones) {
			this.interacciones = interacciones;
		}
		public void setUsuariosOnline(int usuariosOnline) {
			this.usuariosOnline = usuariosOnline;
		}
		
	    public void mostrarMenu(){
	        System.out.println("Menu mostrado...");
	        
	    }
	    public void pulsarEnMenu(){
	        System.out.println("Pulsando en el menu");
	    }
	}

