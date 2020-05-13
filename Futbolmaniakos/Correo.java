package Futbolmaniakos;

public class Correo {

		String de;
		String  asunto;
		String para;
		
		public Correo () {}
		public Correo (String de,String asunto, String para) {
			this.de = de;
			this.asunto = asunto;
			this.para = para;
			
		}
		
		public void setDe(String de) {
			this.de = de;
		}
		public void setAsunto(String asunto) {
			this.asunto = asunto;
		}
		public void setPara(String para) {
			this.para = para;
		}
		
	    public void enviarCorreo(){
	        System.out.println("Correo enviado...");
	        
	    }
	    public void recibirCorreo(){
	        System.out.println("Correo recibido...");
	    }
	}
