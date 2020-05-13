package Futbolmaniakos;

public class Inicio {

		String nombreUsuario;
		String  contraseña;
		int  horaInicio;
		
		public Inicio () {}
		public Inicio (String nombreUsuario, String contraseña, int horaInicio) {
			this.nombreUsuario = nombreUsuario;
			this.contraseña = contraseña;
			this.horaInicio = horaInicio;
			
		}
		
		public void setnombreUsuario(String nombreUsuario) {
			this.nombreUsuario = nombreUsuario;
		}
		public void setContraseña(String contraseña) {
			this.contraseña = contraseña;
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
