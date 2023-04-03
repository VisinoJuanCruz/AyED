package tp02.ejercicio2;


import ejercicio3.Estudiante;

public class TestListaEnlazadaGenerica {

	public static void main(String[] args) {
		Estudiante estudiante1 = new Estudiante();
		Estudiante estudiante2 = new Estudiante();
		Estudiante estudiante3 = new Estudiante();
		Estudiante estudiante4 = new Estudiante();
		
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
		
		estudiante3.setNombre("Carlos");
		estudiante3.setApellido("Moncho");
		estudiante3.setEmail("carlitosgmail.com");
		estudiante3.setComision("7B");
		estudiante3.setDireccion("Calle 520");
		
		estudiante4.setNombre("Peter");
		estudiante4.setApellido("Jorge");
		estudiante4.setEmail("PJ@hotmail.com");
		estudiante4.setComision("1F");
		estudiante4.setDireccion("Calle 32");

		
		ListaEnlazadaGenerica<Estudiante> listaEstudiantes = new ListaEnlazadaGenerica<Estudiante>();
		listaEstudiantes.agregarFinal(estudiante1);
		listaEstudiantes.agregarFinal(estudiante2);
		
		Estudiante[] segundaLista = new Estudiante[100];
		
		segundaLista[0] = estudiante3;
		segundaLista[1] = estudiante4;
		segundaLista[2] = estudiante3;
		
		
		
		
		System.out.println("Primera Lista: ");
		
		for(int i = 1; i <= listaEstudiantes.tamanio(); i++) {
			System.out.println(listaEstudiantes.elemento(i).tusDatos());
		}
		System.out.println("Agregando la segunda lista a la primer lista...");
		
		listaEstudiantes.agregar(segundaLista);
		
		System.out.println("Lista finalizada");
		
		for(int i = 1; i <= listaEstudiantes.tamanio(); i++) {
			System.out.println(listaEstudiantes.elemento(i).tusDatos());
		}
		
	}

}
