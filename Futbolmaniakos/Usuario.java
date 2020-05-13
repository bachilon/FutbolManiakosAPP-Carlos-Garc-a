package Futbolmaniakos;

public class Usuario {

	String nombre;
	String  apellidos;
	String  contraseña;
	
	public Usuario () {}
	public Usuario (String nombre,String apellidos, String contraseña) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.contraseña = contraseña;
		
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
    public void estarEnFutbolmaniakos(){
        System.out.println("Estar en la pagina...");
        
    }
    public void consumirContenido(){
        System.out.println("Consumiendo contenido...");
    }
}