package ejercicio2;
import java.util.Scanner;


public class ejercicio2 {

	public static int[] makeArray(int num){
		  int[] newArray = new int[num];
		  for(int i=0; i<num; i++) {
			  newArray[i] = num*(i+1);
		  }
		  return newArray;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Ingrese un numero: ");
		Scanner s = new Scanner(System.in);
		int[] unArray = makeArray(s.nextInt());
		System.out.println("El arreglo quedó así: ");
		for(int i=0; i<unArray.length;i++) {
			System.out.println(unArray[i]);
		}
		s.close();

	}

}
