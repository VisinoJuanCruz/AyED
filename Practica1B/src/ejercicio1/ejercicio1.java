package ejercicio1;

public class ejercicio1 {

	public static void incisoA(int a, int b) {
		if(a<b) {
			int max = b;
			for(int min=a; min <= max; min++) {
				System.out.println(min);
			}
		}else {
			int max = a;
			for(int min = b; min <= max; min++) {
				System.out.println(min);
			}
		}
	}
	
	public static void incisoB(int a, int b) {
		int min;
		int max;
		if(a<b) {
			min = a;
			max = b;
		}else {
			min = b;
			max = a;
		}
		while(min <= max) {
			System.out.println(min);
			min++;
		}
	}
	
	public static void incisoC(int a, int b) {
		int min;
		int max;
		if(a<b) {
			min = a;
			max = b;
		}else {
			min = b;
			max = a;
		}
		if(min != max) {
			System.out.println(min);
			min++;
			incisoC(min,max);
		}else {
			System.out.println(min);
		}
	}
	
	public static void main(String[] args) {
		incisoA(10,5);
		incisoB(5,8);
		incisoC(5,8);
		

	}

}
