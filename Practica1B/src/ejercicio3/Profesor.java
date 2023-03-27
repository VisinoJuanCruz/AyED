package ejercicio3;

public class Profesor extends Persona{

	private String catedra;
	private String facultad;
	
	public String getCatedra() {
		return this.catedra;
	}
	
	public void setCatedra(String unaCatedra) {
		this.catedra = unaCatedra;
	}
	
	public String getFacultad() {
		return this.facultad;
	}
	
	public void setFacultad(String unaFacultad) {
		this.facultad = unaFacultad;
	}
	
	public String tusDatos() {
		return ("Nombre: "+getNombre()+"\nApellido: "+getApellido()+"\nEmail: "+getEmail()+"\nCatedra: "+getCatedra()+"\nFacultad: "+getFacultad()+"\n");
	}
}
