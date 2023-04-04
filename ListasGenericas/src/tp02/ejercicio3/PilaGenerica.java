package tp02.ejercicio3;

import tp02.ejercicio2.NodoGenerico;

public class PilaGenerica<T>  {

	
	private NodoGenerico<T> ultimo;
	private int tamanio;
	
	public boolean esVacia() {
		return this.tamanio == 0;
	}
	
	public void apilar(T elem) {
		
		NodoGenerico<T> nuevoNodo = new NodoGenerico<T>();
		nuevoNodo.setDato(elem);	
		if(this.esVacia()) {
			this.tamanio++;
			this.ultimo = nuevoNodo;
		}else {
			nuevoNodo.setSiguiente(this.ultimo);
			this.tamanio++;
			this.ultimo = nuevoNodo;
		}
	}
	
	public T desapilar() {
		T dato = this.ultimo.getDato();
		this.ultimo = ultimo.getSiguiente();
		this.tamanio--;
		return dato;
	}
	
	public T tope() {
		return this.ultimo.getDato();
	}

	
	
	
	
	
		
	
}
