package tp02.ejercicio1;

public class Ejercicio1_6 {

	
	
	
	public static ListaDeEnterosEnlazada calcularSucesion(int n) {
		
		int resultado = 0;
		
		if(n == 1){
			ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
			lista.agregarFinal(n);
			return lista;
		}else {
			if((n % 2) == 0) {
				resultado = (n/2);
			}else {
				resultado = (n*3 + 1);
			}
		}
		
		ListaDeEnterosEnlazada lista = calcularSucesion(resultado);
		lista.agregarFinal(n);
		return lista;
		
	
		
	}
	
	
	public static void main(String[] args) {
		ListaDeEnterosEnlazada listita = calcularSucesion(6);
		for(int i = 1; i <= listita.tamanio(); i++) {
			System.out.println(listita.elemento(i));
		}
		

	}

}
