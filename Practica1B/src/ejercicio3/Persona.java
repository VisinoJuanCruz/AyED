package ejercicio3;

public abstract class Persona {

		private String nombre;
		private String apellido;
		private String email;
		
		public String getNombre() {
			return this.nombre;
		}
		
		public void setNombre(String unNombre) {
			this.nombre = unNombre;
		}
		
		public String getApellido() {
			return this.apellido;
		}
		
		public void setApellido(String unApellido) {
			this.apellido = unApellido;
		}
		
		public String getEmail() {
			return this.email;
		}
		
		public void setEmail(String unEmail) {
			this.email = unEmail;
		}
		
		abstract String tusDatos();
}
