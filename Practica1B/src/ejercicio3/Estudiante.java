package ejercicio3;

public class Estudiante extends Persona {

	
	private String comision;
	private String direccion;
	
	public String getComision() {
		return this.comision;
	}
	
	public void setComision(String unaComision) {
		this.comision = unaComision;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public void setDireccion(String unaDireccion) {
		this.direccion = unaDireccion;
	}
	
	public String tusDatos() {
		return ("Nombre: "+getNombre()+"\nApellido: "+getApellido()+"\nEmail: "+getEmail()+"\nComision: "+getComision()+"\nDireccion: "+getDireccion()+"\n");
	}
	
	
}
