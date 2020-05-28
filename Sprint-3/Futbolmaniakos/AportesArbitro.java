package Futbolmaniakos;

public class AportesArbitro {
	
		String nombreArbitro;
		String  reclamacion;
			int  ranking;
			
			public AportesArbitro () {}
			public AportesArbitro (String nombreArbitro,String reclamacion, int ranking) {
				this.nombreArbitro = nombreArbitro;
				this.reclamacion = reclamacion;
				this.ranking = ranking;
				
			}
			
			public void setNombreArbitro(String nombreArbitro) {
				this.nombreArbitro = nombreArbitro;
			}
			public void setReclamacion(String reclamacion) {
				this.reclamacion = reclamacion;
			}
			public void setRanking(int ranking) {
				this.ranking = ranking;
			}
			
		    public void hablarArbitro(){
		        System.out.println("Hablando con el arbitro...");
		        
		    }
		    public void quejarseArbitro(){
		        System.out.println("Quejarse del arbitro");
		    }
		}


