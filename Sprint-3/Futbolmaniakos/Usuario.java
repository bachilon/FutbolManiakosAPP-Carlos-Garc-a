package Futbolmaniakos;

public class Usuario {

	String nombre;
	String  apellidos;
	String  contrase�a;
	
	public Usuario () {}
	public Usuario (String nombre,String apellidos, String contrase�a) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.contrase�a = contrase�a;
		
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
    public void estarEnFutbolmaniakos(){
        System.out.println("Estar en la pagina...");
        
    }
    public void consumirContenido(){
        System.out.println("Consumiendo contenido...");
    }
}