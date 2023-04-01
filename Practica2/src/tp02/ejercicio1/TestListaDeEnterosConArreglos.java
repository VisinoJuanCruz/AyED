package tp02.ejercicio1;

public class TestListaDeEnterosConArreglos {

	static Recursiva recursiva = new Recursiva();
	
	public static void imprimirEnReversa(ListaDeEnterosConArreglos lista) {
		lista.comenzar();
		if(lista.fin()) {
			System.out.println("Fin de la lista.");
		}else {
			imprimirEnReversa(lista);
		}
	}
	
	
	public static void main(String[] args) {
		
		ListaDeEnterosConArreglos lista = new ListaDeEnterosConArreglos();
		
		
		for(int i = 0; i< args.length; i++) {
			lista.agregarFinal(Integer.parseInt(args[i]));
		}
		
		for(int i = 1; i<= lista.tamanio(); i++) {
			System.out.println(lista.elemento(i));
		}
		
		recursiva.imprimir(lista);

	}

}
