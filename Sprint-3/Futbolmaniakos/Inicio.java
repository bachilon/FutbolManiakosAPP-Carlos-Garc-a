package Futbolmaniakos;

public class Inicio {

		String nombreUsuario;
		String  contrase�a;
		int  horaInicio;
		
		public Inicio () {}
		public Inicio (String nombreUsuario, String contrase�a, int horaInicio) {
			this.nombreUsuario = nombreUsuario;
			this.contrase�a = contrase�a;
			this.horaInicio = horaInicio;
			
		}
		
		public void setnombreUsuario(String nombreUsuario) {
			this.nombreUsuario = nombreUsuario;
		}
		public void setContrase�a(String contrase�a) {
			this.contrase�a = contrase�a;
		}
		public void setHoraInicio(int horaInicio) {
			this.horaInicio = horaInicio;
		}
		
	    public void iniciarSesion(){
	        System.out.println("Abriendo sesion...");
	        
	    }
	    public void cerrarSesion(){
	        System.out.println("Cerrando sesion");
	    }
	}
