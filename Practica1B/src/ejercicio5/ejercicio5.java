package ejercicio5;

public class ejercicio5 {

	static int[] intArray = new int[] {5,6,7,10,22,30};
	
	public static MinMaxAvg primeraFuncion() {
		return new MinMaxAvg(intArray);
	}
	
	public static void segundaFuncion(MinMaxAvg MinMaxAvg) {
		System.out.println("Minimo: "+MinMaxAvg.getMin());
		System.out.println("Máximo: "+MinMaxAvg.getMax());
		System.out.println("Promedio: "+MinMaxAvg.getAvg());
	}
	
	public static void terceraFuncion() {
		MinMaxAvg minMaxAvg = new MinMaxAvg(intArray);
		System.out.println("Minimo: "+minMaxAvg.getMin());
		System.out.println("Máximo: "+minMaxAvg.getMax());
		System.out.println("Promedio: "+minMaxAvg.getAvg());
	}
	
	public static void main(String[] args) {
		
		primeraFuncion();
		segundaFuncion(new MinMaxAvg(intArray));
		terceraFuncion();
		

	}

}
