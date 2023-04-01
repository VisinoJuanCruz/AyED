package tp02.ejercicio1;

public class TestListaDeEnterosEnlazada {

	public static void main(String[] args) {
		
		ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
		
		for(int i = 0; i < args.length; i++) {
			lista.agregarFinal(Integer.parseInt(args[i]));
		}

		for(int i = 1; i <= args.length; i++) {
			System.out.println(lista.elemento(i));
		}

	}

}
