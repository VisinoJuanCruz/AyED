package tp02.ejercicio4;
import tp02.ejercicio3.PilaGenerica;

public class TestBalanceo<T> {

	public static boolean estaBalanceado(String cadena) {
		PilaGenerica<Character> pila = new PilaGenerica<Character>();
		
		for(int i = 0; i < cadena.length(); i++) {
			char c = cadena.charAt(i);
			
			
			if(c =='[' || c == '{' || c == '(') {
				pila.apilar(c);
			}else {
				if(pila.esVacia()) {
					return false;
				}else if(c == ']' && pila.tope() == '[') {
					pila.desapilar();				
				}else if(c == ')' && pila.tope() == '(') {
					pila.desapilar();	
				}else if(c == '}' && pila.tope() == '{') {
					pila.desapilar();	
				}else {
					return false;
				}
		
			}
		
		}
		return pila.esVacia();
		
	}
	
	public static void main(String[] args) {
		
		
		String secuencia = "{()}";
		System.out.println(estaBalanceado(secuencia));
		
	

	}
}
