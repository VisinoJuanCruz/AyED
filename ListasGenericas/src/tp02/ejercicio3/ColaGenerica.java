package tp02.ejercicio3;

import tp02.ejercicio2.NodoGenerico;

public class ColaGenerica<T> {

	private NodoGenerico<T> primero;
	private NodoGenerico<T> ultimo;
	private int tamanio = 0;
	
	
	public void encolar(T elem) {
		
		NodoGenerico<T> nuevoNodo = new NodoGenerico<T>();
		nuevoNodo.setDato(elem);
		if(this.esVacia()) {
			this.primero = nuevoNodo;
		}
		this.ultimo.setSiguiente(nuevoNodo);
		this.ultimo = nuevoNodo;
		this.tamanio++;

	}
	
	public NodoGenerico<T> desencolar(){
		
		NodoGenerico<T> nodoDesencolado = this.primero;
		this.primero = this.primero.getSiguiente();
		return nodoDesencolado;
	}
	
	public NodoGenerico<T> tope(){
		return this.ultimo;
	}
	
	public boolean esVacia() {
		return this.tamanio == 0;
	}
	
}
