package tp02.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;


public class ColaGenerica<T> {

	private ListaEnlazadaGenerica<T> cola;
	
	
	public ColaGenerica(){
		this.cola = new ListaEnlazadaGenerica<T>();
	}
	
	public void encolar(T elem) {
		cola.agregarFinal(elem);
	}
	
	public T desencolar() {
		T elemento = cola.elemento(1);
		cola.eliminarEn(1);
		return elemento;
	}
	
	public T tope() {
		return cola.elemento(cola.tamanio());
	}
	
	public boolean esVacia() {
		return cola.esVacia();
	}
	
}
