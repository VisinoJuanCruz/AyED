package ejercicio3;


public class ejercicio3 {

	public static void main(String[] args) {
		
		Estudiante[] arrEstudiantes = new Estudiante[2];
		Profesor[] arrProfesores = new Profesor[3];
		
		Estudiante estudiante1 = new Estudiante();
		Estudiante estudiante2 = new Estudiante();
		Profesor profesor1 = new Profesor();
		Profesor profesor2 = new Profesor();
		Profesor profesor3 = new Profesor();
		
		estudiante1.setNombre("Juan Cruz");
		estudiante1.setApellido("Visino");
		estudiante1.setEmail("visinojuancruz@gmail.com");
		estudiante1.setComision("3B");
		estudiante1.setDireccion("Calle 38");
		
		estudiante2.setNombre("Chichi");
		estudiante2.setApellido("Gomez");
		estudiante2.setEmail("chichi@hotmail.com");
		estudiante2.setComision("5D");
		estudiante2.setDireccion("Calle 45");
		
		arrEstudiantes[0] = estudiante1;
		arrEstudiantes[1] = estudiante2;
		
		System.out.println("ARREGLO DE ESTUDIANTES: ");
		for(int i = 0; i< arrEstudiantes.length; i++) {
			System.out.println(arrEstudiantes[i].tusDatos());
		}
		
		profesor1.setNombre("Claudio");
		profesor1.setApellido("Gomez");
		profesor1.setEmail("clau@gmail.com");
		profesor1.setCatedra("5Z");
		profesor1.setFacultad("Informatica");
		
		profesor2.setNombre("Mario");
		profesor2.setApellido("Kempes");
		profesor2.setEmail("mario78@gmail.com");
		profesor2.setCatedra("1A");
		profesor2.setFacultad("Derecho");
		
		profesor3.setNombre("Marcos");
		profesor3.setApellido("Perez");
		profesor3.setEmail("marcosperez@hotmail.com");
		profesor3.setCatedra("2G");
		profesor3.setFacultad("Ingenieria");
		
		arrProfesores[0] = profesor1;
		arrProfesores[1] = profesor2;
		arrProfesores[2] = profesor3;
		
		System.out.println("ARREGLO DE PROFESORES:");
		for(int i = 0; i < arrProfesores.length; i++) {
			System.out.println(arrProfesores[i].tusDatos());
		}

	}

}
