package tp02.ejercicio1;

public class Recursiva {


	public void imprimir(ListaDeEnteros lista) {
		
		if(!lista.fin()) {
			Integer num = lista.proximo();
			imprimir(lista);
			System.out.println(num);
		}
		
	}
	
}
