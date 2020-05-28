package Futbolmaniakos;

public class Futbolmaniakos {

		String nombre;
		int numRegistros;
		int usuariosOnline;
		
		public Futbolmaniakos () {}
		public Futbolmaniakos (String nombre, int numRegistros, int usuariosOnline) {
			this.nombre = nombre;
			this.numRegistros = numRegistros;
			this.usuariosOnline = usuariosOnline;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public void setNumRegistros(int numRegistros) {
			this.numRegistros = numRegistros;
		}
		public void setUsuariosOnline(int usuariosOnline) {
			this.usuariosOnline = usuariosOnline;
		}

		public String getNombre() {
			return this.nombre;
		}
		public int getNumRegistros() {
			return this.numRegistros;
		}
		public int getUsuariosOnline() {
			return this.usuariosOnline;
		}
		public void mostrarPagina() {
			System.out.println("Mostrando pagina...");
		
		}
		public void navegarEnPagina() {
			System.out.println("Navegando...");
		}
	}
