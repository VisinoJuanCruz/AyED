package tp02.ejercicio3;

import tp02.ejercicio2.NodoGenerico;

public class PilaGenerica<T>  {

	private NodoGenerico primero;
	private NodoGenerico ultimo;
	private int tamanio;
	
	public boolean esVacia() {
		return this.tamanio == 0;
	}
	
	public void apilar(T elem) {
		NodoGenerico<T> nuevoNodo = new NodoGenerico<T>();
		nuevoNodo.setDato(elem);
		this.ultimo = nuevoNodo;
		
	}
	
	
	
	
	
		
	
}
