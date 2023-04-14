package tp02.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;


public class PilaGenerica<T>  {

	
	private ListaEnlazadaGenerica<T> pila = new ListaEnlazadaGenerica<T>();
	
	public void apilar(T dato) {
		pila.agregarFinal(dato);
	}
	
	public T desapilar() {
		T elem = pila.elemento(pila.tamanio());
		pila.eliminarEn(pila.tamanio());
		return elem;
	}
	
	public T tope() {
		return pila.elemento(pila.tamanio());
	}
	
	public boolean esVacia() {
		return pila.esVacia();
	}
	
	
	
	
		
	
}
